package lessons.lesson18.homeworks

// Холодильник
abstract class Refrigerator : Powerable, TemperatureRegulatable, Cleanable

// Стиральная машина
abstract class WashingMachine : Powerable, WaterConnection, Drainable, TemperatureRegulatable, Timable, Cleanable

// Умная лампа
abstract class SmartLamp : Powerable, LightEmitting, Programmable, Rechargeable

// Электронные часы
abstract class DigitalClock : Powerable, Timable, LightEmitting, Programmable

// Робот-пылесос
abstract class RobotVacuum : Powerable, Movable, Cleanable, Rechargeable, Programmable

// Механические часы
abstract class MechanicalClock : Mechanical, Timable

// Фонарик
abstract class Flashlight : Powerable, LightEmitting, BatteryOperated

// Кофемашина
abstract class CoffeeMachine : Powerable, WaterConnection, Drainable, TemperatureRegulatable, Programmable, Cleanable

// Умная колонка
abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable, Rechargeable
