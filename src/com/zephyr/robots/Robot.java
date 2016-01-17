
package com.zephyr.robots;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Victor;

/**
 * This is a very basic example of how a photoswitch works.
 * @author Brad
 *
 */
public class Robot extends IterativeRobot {

	private Victor victor;//The Victor to drive a motor
	private DigitalInput input;//The photoswitch digital input
	
    public void robotInit() {
    	victor = new Victor(0);//Setup Victor on PWM 0
    	
    	input = new DigitalInput(4);//Setup PhotoSwitch on DigitalInput 4
    }
    
    public void autonomousInit() {
    }

    public void autonomousPeriodic() {
    }
    
    public void teleopPeriodic() {
    	//If Photoswitch is triggered, spin forward at full speed
        if(input.get())
        {
        	victor.set(1);
        }
        else //Otherwise, stop
        {
        	victor.set(0);
        }
    }
    
    public void testPeriodic() {
    
    }
    
}
