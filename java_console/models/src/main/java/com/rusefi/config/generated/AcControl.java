package com.rusefi.config.generated;

// this file was generated automatically by rusEFI tool ConfigDefinition.jar based on (unknown script) controllers/actuators/ac_control.txt Fri May 05 01:27:32 UTC 2023

// by class com.rusefi.output.FileJavaFieldsConsumer
import com.rusefi.config.*;

public class AcControl {
	public static final int BANKS_COUNT = 2;
	public static final int BOOST_BLEND_COUNT = 2;
	public static final int CAM_INPUTS_COUNT = 4;
	public static final int CAMS_PER_BANK = 2;
	public static final int EGT_CHANNEL_COUNT = 8;
	public static final String GAUGE_CATEGORY_BOOST_CONTROL = "Boost Control";
	public static final String GAUGE_CATEGORY_ETB = "ETB more";
	public static final String GAUGE_CATEGORY_FUEL_MATH = "Fuel: math";
	public static final String GAUGE_CATEGORY_SYNC = "Sync";
	public static final String GAUGE_CATEGORY_TIMING = "Timing";
	public static final String GAUGE_COIL_DWELL_TIME = "Ign: Dwell";
	public static final String GAUGE_NAME_ACCEL_ROLL = "Acceleration: Roll";
	public static final String GAUGE_NAME_ACCEL_X = "Acceleration: X";
	public static final String GAUGE_NAME_ACCEL_Y = "Acceleration: Y";
	public static final String GAUGE_NAME_ACCEL_YAW = "Acceleration: Yaw";
	public static final String GAUGE_NAME_ACCEL_Z = "Acceleration: Z";
	public static final String GAUGE_NAME_ADJUSTED_TIMING = "Timing: ignition";
	public static final String GAUGE_NAME_AFR = "Air/Fuel Ratio";
	public static final String GAUGE_NAME_AFR2 = "Air/Fuel Ratio 2";
	public static final String GAUGE_NAME_AIR_FLOW_ESTIMATE = "MAF estimate";
	public static final String GAUGE_NAME_AIR_FLOW_MEASURED = "MAF";
	public static final String GAUGE_NAME_AIR_FLOW_MEASURED_2 = "MAF #2";
	public static final String GAUGE_NAME_AIR_MASS = "air mass";
	public static final String GAUGE_NAME_AUX_LINEAR_1 = "Aux Linear #1";
	public static final String GAUGE_NAME_AUX_LINEAR_2 = "Aux Linear #2";
	public static final String GAUGE_NAME_AUX_TEMP1 = "Aux temp 1";
	public static final String GAUGE_NAME_AUX_TEMP2 = "Aux temp 2";
	public static final String GAUGE_NAME_BARO_PRESSURE = "Barometric pressure";
	public static final String GAUGE_NAME_BOOST_CLOSED_LOOP = "Boost: Closed loop";
	public static final String GAUGE_NAME_BOOST_OPEN_LOOP = "Boost: Open loop";
	public static final String GAUGE_NAME_BOOST_OUTPUT = "Boost: Output";
	public static final String GAUGE_NAME_BOOST_TARGET = "Boost: Target";
	public static final String GAUGE_NAME_CLT = "CLT";
	public static final String GAUGE_NAME_CPU_TEMP = "CPU Temperature";
	public static final String GAUGE_NAME_CURRENT_GEAR = "Current Gear";
	public static final String GAUGE_NAME_DEBUG_F1 = "debug f1";
	public static final String GAUGE_NAME_DEBUG_F2 = "debug f2: iTerm";
	public static final String GAUGE_NAME_DEBUG_F3 = "debug f3: prevError";
	public static final String GAUGE_NAME_DEBUG_F4 = "debug f4: iParam";
	public static final String GAUGE_NAME_DEBUG_F5 = "debug f5: dParam";
	public static final String GAUGE_NAME_DEBUG_F6 = "debug f6: dTerm";
	public static final String GAUGE_NAME_DEBUG_F7 = "debug f7";
	public static final String GAUGE_NAME_DEBUG_I1 = "debug i1: pParam";
	public static final String GAUGE_NAME_DEBUG_I2 = "debug i2: offset";
	public static final String GAUGE_NAME_DEBUG_I3 = "debug i3";
	public static final String GAUGE_NAME_DEBUG_I4 = "debug i4";
	public static final String GAUGE_NAME_DEBUG_I5 = "debug i5";
	public static final String GAUGE_NAME_DESIRED_GEAR = "Desired Gear";
	public static final String GAUGE_NAME_DETECTED_GEAR = "Detected Gear";
	public static final String GAUGE_NAME_DWELL_DUTY = "Ign: Coil duty cycle";
	public static final String GAUGE_NAME_ECU_TEMPERATURE = "ECU temperature";
	public static final String GAUGE_NAME_ENGINE_CRC16 = "Engine CRC16";
	public static final String GAUGE_NAME_ETB_DUTY = "ETB: Duty";
	public static final String GAUGE_NAME_ETB_ERROR = "ETB: position error";
	public static final String GAUGE_NAME_ETB_TARGET = "ETB: position target";
	public static final String GAUGE_NAME_FLEX = "Flex Ethanol %";
	public static final String GAUGE_NAME_FUEL_BARO_CORR = "Fuel: Barometric pressure mult";
	public static final String GAUGE_NAME_FUEL_BASE = "Fuel: base mass";
	public static final String GAUGE_NAME_FUEL_CHARGE_TEMP = "Fuel: Estimated charge temperature";
	public static final String GAUGE_NAME_FUEL_CLT_CORR = "Fuel: CLT correction";
	public static final String GAUGE_NAME_FUEL_CONSUMPTION = "Fuel: Total consumed";
	public static final String GAUGE_NAME_FUEL_CRANKING = "Fuel: cranking";
	public static final String GAUGE_NAME_FUEL_FLOW = "Fuel: Flow rate";
	public static final String GAUGE_NAME_FUEL_IAT_CORR = "Fuel: IAT correction";
	public static final String GAUGE_NAME_FUEL_INJ_DUTY = "Fuel: injector duty cycle";
	public static final String GAUGE_NAME_FUEL_INJECTION_TIMING = "Fuel: Injection timing SOI";
	public static final String GAUGE_NAME_FUEL_LAST_INJECTION = "Fuel: Last inj pulse width";
	public static final String GAUGE_NAME_FUEL_LEVEL = "Fuel level";
	public static final String GAUGE_NAME_FUEL_LOAD = "Fuel: load";
	public static final String GAUGE_NAME_FUEL_PRESSURE_HIGH = "Fuel pressure (high)";
	public static final String GAUGE_NAME_FUEL_PRESSURE_HIGH_UNITS = "bar";
	public static final String GAUGE_NAME_FUEL_PRESSURE_LOW = "Fuel pressure (low)";
	public static final String GAUGE_NAME_FUEL_PRESSURE_LOW_UNITS = "kPa";
	public static final String GAUGE_NAME_FUEL_RUNNING = "Fuel: running";
	public static final String GAUGE_NAME_FUEL_TPS_EXTRA = "Fuel: TPS AE add fuel ms";
	public static final String GAUGE_NAME_FUEL_TPS_ROC = "Fuel: TPS AE change";
	public static final String GAUGE_NAME_FUEL_TRIM = "Fuel: fuel trim";
	public static final String GAUGE_NAME_FUEL_TRIM_2 = "Fuel: fuel trim 2";
	public static final String GAUGE_NAME_FUEL_VE = "Fuel: VE";
	public static final String GAUGE_NAME_FUEL_WALL_AMOUNT = "Fuel: wall amount";
	public static final String GAUGE_NAME_FUEL_WALL_CORRECTION = "Fuel: wall correction";
	public static final String GAUGE_NAME_FW_VERSION = "ECU Software Version";
	public static final String GAUGE_NAME_GEAR_RATIO = "Gearbox Ratio";
	public static final String GAUGE_NAME_IAC = "Idle: Position";
	public static final String GAUGE_NAME_IAT = "IAT";
	public static final String GAUGE_NAME_IDLE_POSITION = "Idle position sensor";
	public static final String GAUGE_NAME_IGNITION_LOAD = "Ign: Load";
	public static final String GAUGE_NAME_IGNITION_MODE = "Ign: Mode";
	public static final String GAUGE_NAME_INJECTION_MODE = "Fuel: Injection mode";
	public static final String GAUGE_NAME_INJECTOR_LAG = "Fuel: injector lag";
	public static final String GAUGE_NAME_ISS = "Input Shaft Speed";
	public static final String GAUGE_NAME_KNOCK_COUNTER = "Knock: Count";
	public static final String GAUGE_NAME_KNOCK_LEVEL = "Knock: Current level";
	public static final String GAUGE_NAME_KNOCK_RETARD = "Knock: Retard";
	public static final String GAUGE_NAME_LAMBDA = "Lambda";
	public static final String GAUGE_NAME_LAMBDA2 = "Lambda 2";
	public static final String GAUGE_NAME_LAST_ERROR = "Last error";
	public static final String GAUGE_NAME_MAF = "MAF";
	public static final String GAUGE_NAME_MAP = "MAP";
	public static final String GAUGE_NAME_OIL_PRESSURE = "Oil Pressure";
	public static final String GAUGE_NAME_OIL_PRESSURE_UNITS = "kPa";
	public static final String GAUGE_NAME_RAW_FUEL_PRESSURE_HIGH = "Fuel pressure raw (high)";
	public static final String GAUGE_NAME_RAW_FUEL_PRESSURE_LOW = "Fuel pressure raw (low)";
	public static final String GAUGE_NAME_RPM = "RPM";
	public static final String GAUGE_NAME_TARGET_AFR = "Fuel: target AFR";
	public static final String GAUGE_NAME_TARGET_LAMBDA = "Fuel: target lambda";
	public static final String GAUGE_NAME_TC_RATIO = "Torque Converter Ratio";
	public static final String GAUGE_NAME_TCHARGE = "Fuel: SD tCharge";
	public static final String GAUGE_NAME_THROTTLE_PEDAL = "Throttle pedal position";
	public static final String GAUGE_NAME_TIME = "Time";
	public static final String GAUGE_NAME_TIMING_ADVANCE = "Ign: Timing";
	public static final String GAUGE_NAME_TPS = "TPS";
	public static final String GAUGE_NAME_TPS2 = "TPS2";
	public static final String GAUGE_NAME_TRG_ERR = "Trigger Error Counter";
	public static final String GAUGE_NAME_TRG_GAP = "Trigger Sync Latest Ratio";
	public static final String GAUGE_NAME_TUNE_CRC16 = "Tune CRC16";
	public static final String GAUGE_NAME_TURBO_SPEED = "Turbocharger Speed";
	public static final String GAUGE_NAME_UPTIME = "Uptime";
	public static final String GAUGE_NAME_VBAT = "VBatt";
	public static final String GAUGE_NAME_VERSION = "firmware";
	public static final String GAUGE_NAME_VVS = "Vehicle Speed";
	public static final String GAUGE_NAME_VVT_B1E = "VVT: bank 1 exhaust";
	public static final String GAUGE_NAME_VVT_B1I = "VVT: bank 1 intake";
	public static final String GAUGE_NAME_VVT_B2E = "VVT: bank 2 exhaust";
	public static final String GAUGE_NAME_VVT_B2I = "VVT: bank 2 intake";
	public static final String GAUGE_NAME_VVT_TARGET_B1E = "VVT: bank 1 exhaust target";
	public static final String GAUGE_NAME_VVT_TARGET_B1I = "VVT: bank 1 intake target";
	public static final String GAUGE_NAME_VVT_TARGET_B2E = "VVT: bank 2 exhaust target";
	public static final String GAUGE_NAME_VVT_TARGET_B2I = "VVT: bank 2 intake target";
	public static final String GAUGE_NAME_WARNING_COUNT = "Warning count";
	public static final String GAUGE_NAME_WARNING_COUNTER = "warning: counter";
	public static final String GAUGE_NAME_WARNING_LAST = "warning: last";
	public static final String GAUGE_NAME_WG_POSITION = "Wastegate position sensor";
	public static final int GEARS_COUNT = 8;
	public static final int IGN_BLEND_COUNT = 4;
	public static final String INDICATOR_NAME_AC_SWITCH = "AC switch";
	public static final String INDICATOR_NAME_BRAKE_DOWN = "Brake switch";
	public static final String INDICATOR_NAME_CLUTCH_DOWN = "Clutch: down";
	public static final String INDICATOR_NAME_CLUTCH_UP = "Clutch: up";
	public static final int LUA_ANALOG_INPUT_COUNT = 8;
	public static final int LUA_GAUGE_COUNT = 2;
	public static final int MAX_CYLINDER_COUNT = 12;
	public static final int PACK_ADD_TEMPERATURE = 40;
	public static final int PACK_MULT_AFR = 1000;
	public static final int PACK_MULT_AFR_CFG = 10;
	public static final int PACK_MULT_ANGLE = 50;
	public static final int PACK_MULT_FUEL_FLOW = 200;
	public static final int PACK_MULT_FUEL_MASS = 100;
	public static final int PACK_MULT_HIGH_PRESSURE = 10;
	public static final int PACK_MULT_LAMBDA = 10000;
	public static final int PACK_MULT_LAMBDA_CFG = 147;
	public static final int PACK_MULT_MASS_FLOW = 10;
	public static final int PACK_MULT_MS = 300;
	public static final int PACK_MULT_PERCENT = 100;
	public static final int PACK_MULT_PRESSURE = 30;
	public static final int PACK_MULT_TEMPERATURE = 100;
	public static final int PACK_MULT_VOLTAGE = 1000;
	public static final int PACK_MULT_VSS = 100;
	public static final int TPS_2_BYTE_PACKING_MULT = 100;
	public static final int VE_BLEND_COUNT = 4;
	public static final Field ACBUTTONSTATE = Field.create("ACBUTTONSTATE", 0, FieldType.BIT, 0).setBaseOffset(1020);
	public static final Field M_ACENABLED = Field.create("M_ACENABLED", 0, FieldType.BIT, 1).setBaseOffset(1020);
	public static final Field ENGINETOOSLOW = Field.create("ENGINETOOSLOW", 0, FieldType.BIT, 2).setBaseOffset(1020);
	public static final Field ENGINETOOFAST = Field.create("ENGINETOOFAST", 0, FieldType.BIT, 3).setBaseOffset(1020);
	public static final Field NOCLT = Field.create("NOCLT", 0, FieldType.BIT, 4).setBaseOffset(1020);
	public static final Field ENGINETOOHOT = Field.create("ENGINETOOHOT", 0, FieldType.BIT, 5).setBaseOffset(1020);
	public static final Field TPSTOOHIGH = Field.create("TPSTOOHIGH", 0, FieldType.BIT, 6).setBaseOffset(1020);
	public static final Field ISDISABLEDBYLUA = Field.create("ISDISABLEDBYLUA", 0, FieldType.BIT, 7).setBaseOffset(1020);
	public static final Field ACCOMPRESSORSTATE = Field.create("ACCOMPRESSORSTATE", 0, FieldType.BIT, 8).setBaseOffset(1020);
	public static final Field LATEST_USAGE_AC_CONTROL = Field.create("LATEST_USAGE_AC_CONTROL", 4, FieldType.INT).setScale(1.0).setBaseOffset(1020);
	public static final Field ACSWITCHLASTCHANGETIMEMS = Field.create("ACSWITCHLASTCHANGETIMEMS", 8, FieldType.INT).setScale(1.0).setBaseOffset(1020);
	public static final Field[] VALUES = {
	ACBUTTONSTATE,
	M_ACENABLED,
	ENGINETOOSLOW,
	ENGINETOOFAST,
	NOCLT,
	ENGINETOOHOT,
	TPSTOOHIGH,
	ISDISABLEDBYLUA,
	ACCOMPRESSORSTATE,
	LATEST_USAGE_AC_CONTROL,
	ACSWITCHLASTCHANGETIMEMS,
	};
}
