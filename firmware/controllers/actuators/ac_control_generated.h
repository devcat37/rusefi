#pragma once
#include "rusefi_types.h"
struct ac_control_s {
	// @@INDICATOR_NAME_AC_SWITCH@@
	// offset 0 bit 0
	bool acButtonState : 1 {};

	// AC enabled
	// offset 0 bit 1
	bool m_acEnabled : 1 {};

	// AC engine too slow
	// offset 0 bit 2
	bool engineTooSlow : 1 {};

	// AC engine too fast
	// offset 0 bit 3
	bool engineTooFast : 1 {};

	// AC no CLT
	// offset 0 bit 4
	bool noClt : 1 {};

	// AC engine too hot
	// offset 0 bit 5
	bool engineTooHot : 1 {};

	// AC tps too high
	// offset 0 bit 6
	bool tpsTooHigh : 1 {};

	// AC disabled by Lua
	// offset 0 bit 7
	bool isDisabledByLua : 1 {};

	// AC compressor on
	// offset 0 bit 8
	bool acCompressorState : 1 {};

	// offset 0 bit 9
	bool unusedBit_9_9 : 1 {};

	// offset 0 bit 10
	bool unusedBit_9_10 : 1 {};

	// offset 0 bit 11
	bool unusedBit_9_11 : 1 {};

	// offset 0 bit 12
	bool unusedBit_9_12 : 1 {};

	// offset 0 bit 13
	bool unusedBit_9_13 : 1 {};

	// offset 0 bit 14
	bool unusedBit_9_14 : 1 {};

	// offset 0 bit 15
	bool unusedBit_9_15 : 1 {};

	// offset 0 bit 16
	bool unusedBit_9_16 : 1 {};

	// offset 0 bit 17
	bool unusedBit_9_17 : 1 {};

	// offset 0 bit 18
	bool unusedBit_9_18 : 1 {};

	// offset 0 bit 19
	bool unusedBit_9_19 : 1 {};

	// offset 0 bit 20
	bool unusedBit_9_20 : 1 {};

	// offset 0 bit 21
	bool unusedBit_9_21 : 1 {};

	// offset 0 bit 22
	bool unusedBit_9_22 : 1 {};

	// offset 0 bit 23
	bool unusedBit_9_23 : 1 {};

	// offset 0 bit 24
	bool unusedBit_9_24 : 1 {};

	// offset 0 bit 25
	bool unusedBit_9_25 : 1 {};

	// offset 0 bit 26
	bool unusedBit_9_26 : 1 {};

	// offset 0 bit 27
	bool unusedBit_9_27 : 1 {};

	// offset 0 bit 28
	bool unusedBit_9_28 : 1 {};

	// offset 0 bit 29
	bool unusedBit_9_29 : 1 {};

	// offset 0 bit 30
	bool unusedBit_9_30 : 1 {};

	// offset 0 bit 31
	bool unusedBit_9_31 : 1 {};

	// AC latest activity
	// offset 4
	int latest_usage_ac_control = (int)0;

	// offset 8
	int acSwitchLastChangeTimeMs = (int)0;

};
static_assert(sizeof(ac_control_s) == 12);

