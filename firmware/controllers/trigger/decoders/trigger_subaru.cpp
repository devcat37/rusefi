/**
 * @file	trigger_subaru.cpp
 *
 * @date Sep 10, 2015
 * @author Andrey Belomutskiy, (c) 2012-2017
 */

#include "trigger_subaru.h"

/**
 * This trigger is also used by Nissan and Mazda
 */
void initialize36_2_2_2(TriggerShape *s DECLARE_ENGINE_PARAMETER_S) {
	s->initialize(FOUR_STROKE_CAM_SENSOR, true);

	float wide = 30 * 2;
	float narrow = 10 * 2;

	s->isSynchronizationNeeded = true;
	s->setTriggerSynchronizationGap(0.5);
	s->setSecondTriggerSynchronizationGap(1);

	float base = 0;

	for (int i = 0; i < 12; i++) {
		s->addEvent2(base + narrow / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
		s->addEvent2(base + narrow, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);
		base += narrow;
	}

	s->addEvent2(base + wide / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(base + wide, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);
	base += wide;

	for (int i = 0; i < 15; i++) {
		s->addEvent2(base + narrow / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
		s->addEvent2(base + narrow, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);
		base += narrow;
	}

	s->addEvent2(720 - wide - wide / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(720 - wide, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);

	s->addEvent2(720 - wide / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(720, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);
	s->useOnlyPrimaryForSync = true;
}

void initializeSubaru7_6(TriggerShape *s DECLARE_ENGINE_PARAMETER_S) {
	s->initialize(FOUR_STROKE_CAM_SENSOR, false);

	float t2 = 25;
	float t3 = 15;
	float width = 5;

	s->addEvent2(180 - width / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(180, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);

	s->addEvent2(360 - t2 - width / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(360 - t2, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);

	s->addEvent2(360 - width / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(360, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);

	s->addEvent2(540 - width / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(540, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);


	s->addEvent2(720 - 2 * t3 - width / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(720 - 2 * t3, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);

	s->addEvent2(720 - t3 - width / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(720 - t3, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);


	s->addEvent2(720 - width / 2, T_PRIMARY, TV_RISE PASS_ENGINE_PARAMETER);
	s->addEvent2(720, T_PRIMARY, TV_FALL PASS_ENGINE_PARAMETER);

	s->setTriggerSynchronizationGap(12);

	s->isSynchronizationNeeded = true;

	s->useOnlyPrimaryForSync = true;

}
