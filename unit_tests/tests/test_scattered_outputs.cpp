#include "pch.h"
#include "FragmentEntry.h"

static uint8_t buffer10[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
static uint8_t buffer5[] = {11, 12, 13, 14, 15};

static FragmentEntry fragments[] = {
		FragmentEntry(buffer10, sizeof(buffer10)),
		FragmentEntry(buffer5, sizeof(buffer5)),
		FragmentEntry(nullptr, sizeof(5)),
};

TEST(outputs, fragments) {
	ASSERT_EQ(3, efi::size(fragments));

	uint8_t buffer[120];
	{
		uint8_t expected[] = {9, 10, 11, 12, 13};
		copyRange(buffer, fragments, efi::size(fragments), 8, 5);
		EXPECT_TRUE( 0 == std::memcmp(buffer, expected, sizeof(expected)));
	}

	{
		uint8_t expected[] = {13, 14, 15};
		copyRange(buffer, fragments, efi::size(fragments), 12, 3);
		EXPECT_TRUE( 0 == std::memcmp(buffer, expected, sizeof(expected)));
	}

	{
		uint8_t expected[] = {15, 0, 0};
		copyRange(buffer, fragments, efi::size(fragments), 14, 3);
		EXPECT_TRUE( 0 == std::memcmp(buffer, expected, sizeof(expected)));
	}

	{
		uint8_t expected[] = {0, 0, 0};
		copyRange(buffer, fragments, efi::size(fragments), 114, 3);
		EXPECT_TRUE( 0 == std::memcmp(buffer, expected, sizeof(expected)));
	}
}
