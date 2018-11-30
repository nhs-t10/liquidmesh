
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.Turning;
import org.firstinspires.ftc.teamcode.BasicTankMode;

@Autonomous
public class AutonomousCrater extends AutonomousTesting {



    /* WE STILL NEED TO INITIALIZE THE IMU, ASK PAUL WHAT WE HAVE OT DO FOR THAT */
    int step  = 1;
    long timer1;

    public void loop() {
        timer1 = System.currentTimeMillis();
        //init(); - not deleted because I don't want to mess up everything.

        if (step == 1) {
            unLatch();
            if (timer1 >= 5000) {
                step++;
                drive(0, 0,0,0);
                timer1 = 0;
            }
        }

        if (step == 2) {
            drive(0.5,0.5,0.5,0.5);
            if (timer1 >= 2000) {
                drive(0, 0,0,0);
                timer1 = 0;
                step++;
            }

        }

        if (step == 3) {
            Turning.setDestination(-90);
            Turning.update(Turning.currentAngle);
//            if (Turning.error < 3) {
//                drive(0, 0,0,0);
//                timer1 = 0;
//                step++;
//            }
            if (timer1 == 5000) {
                drive(0, 0,0,0);
                timer1 = 0;
                step++;
            }
        }

        if (step == 4) {
            drive(0.5f,0.5f,0.5f, 0.5f);
            if (timer1 >= 2000) {
                drive(0,0,0,0);
                timer1 = 0;
                step++;
            }
        }

        if (step == 5) {
            Turning.setDestination(-135);
            Turning.update(Turning.currentAngle);
            if (Turning.error < 3) {
                drive(0,0,0,0);
                timer1 = 0;
                step++;
            }
        }

        if (step == 6) {
            drive(0.5f,0.5f, 0.5f, 0.5f);
            if (timer1 == 2000) {
                drive(0,0,0,0);
                timer1 = 0;
                step++;
            }
        }

        if (step == 7) {
            drive(-1,-1,-1,-1);
            if (timer1 == 2000) {
                drive(0,0,0,0);
            }
        }
        telemetry.addData("Front Left Power: ", frontLeft.getPower());
        telemetry.addData("Front Right Power: ", frontRight.getPower());
        telemetry.addData("Back Left Power: ", backLeft.getPower());
        telemetry.addData("Back Right Power: ", backRight.getPower());
        telemetry.addData("Time: ", System.currentTimeMillis() + "");
        telemetry.addData("Step: ", step + "");
    }
}

