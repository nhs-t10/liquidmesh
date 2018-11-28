//
//package org.firstinspires.ftc.teamcode;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//
//@Autonomous
//public class Turning extends LO2Library {
//    public static float error;
//    float currentAngle;
//    static float destination;
//    float pComponent;
//    static boolean turning=false;
//    public float sumError = 0;
//    static float prevTime = 0;
//    final float P = 0.03f;
//
//
//    DcMotor frontLeft, backLeft, frontRight, backRight;
//
//
//    public void init() {
//        /*Naming the Motors for phone*/
//        frontLeft = hardwareMap.dcMotor.get("FL");
//        backLeft = hardwareMap.dcMotor.get("BL");
//        frontRight = hardwareMap.dcMotor.get("FR");
//        backRight = hardwareMap.dcMotor.get("BR");
//    }
//
//
//    public final void drive(float bl, float fl, float fr, float br ) {
//
//        frontLeft.setPower(-fl);
//        backRight.setPower(br);
//        frontRight.setPower(fr);
//        backLeft.setPower(-bl);
//
//    }
//
//    public void Turning() {
//        destination=0;
//    }
//
//    public static void setDestination(float degrees){
//        if(degrees>180) destination=degrees-360;
//        else destination=degrees;
//        prevTime = getCurrTime();
//        destination=degrees;
//        turning=true;
//    }
//
//    public void stopTurning(){
//        turning = false;
//        sumError=0;
//        drive(0,0,0,0);
//    }
//
//    public void update(float sean) {
//        currentAngle = sean;
//        error = getError();
//        pComponent = error * P;
//        double currTime = getCurrTime();
//
//
//        sumError += error*(currTime-prevTime);
//        if (turning) {
//            if (Math.abs(error) < 3) {
//                stopTurning();
////            }
//            drive((pComponent), (pComponent),-(pComponent),-(pComponent));
//
//        }
//        prevTime = (float)currTime;
//    }
//
//    public float getError(){
//        return currentAngle- destination ;
//    }
//
//    public static float getCurrTime() {
//        return System.currentTimeMillis();
//    }
//}