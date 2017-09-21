package org.cloudbus.cloudsim.examples.power;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.cloudbus.cloudsim.examples.power.planetlab.PlanetLabConstants;
import org.cloudbus.cloudsim.power.PowerHost;
import org.cloudbus.cloudsim.examples.power.Constants;
import org.cloudbus.cloudsim.Vm;

/**
 * The class QLearning.
 *
 * Include the basic Q-Learning settings.
 *  - State
 *  - Action
 *
 */

public class QLearning {

    HashMap<String, HashMap<String, Double>> qTable = new HashMap<~>();

    /** Convert from Python. */

    private static double FIELD_SIZE = 10000;
    private static double NUM_C = 50;
    private static double NUM_C_INTER = 25;
    private static double NUM_C_INTRA = 2;
    private static double NUM_N = 5;
    private static double NUM_U = 200;

    private static double P_IDLE = 0.1;  // need to change according to cloudsim
    private static double P_MAX = 1;
    private static double T = 100;

    private static double BANDWIDTH = 100;

    private static double CPU_SCALE = 10;
    private static double Z_SCALE = 3;

    private static double MEMORY_CAPACITY = 100000;
    private static double BATCH_SIZE = 64;

    private static double GAMMA = 0.99;
    private static double EPSILON_DECAY = 0.995;
    private static double EPSILON_MIN = 0.01;
    private static double EPSILON_MAX = 1;
    private static double LAMBDA = 0.001;

    private static double OMEGA1 = 1;
    private static double OMEGA2 = 1;
    private static double OMEGA3 = 1;

    /** New in Cloudsim. */

    public List<? extends Vm> vmList;
    public List<PowerHost> hostList;
    public double [] hostMips;
    public int [] activeFlag;
    private String defaultAct;
    public String curLocation;
    private int hostNum;
    public int numLevel;


    public QLearning(double [] HMips) {
        this.hostNum = PlanetLabConstants.NUMBER_OF_HOSTS;
        this.hostMips = HMips;
        this.numLevel = Constants.UTIL_LEVEL;

    }

    /**
     * pre process the input data.
     */
    public dataPreProcess() {
        return;
    }


    public void setDefaultAction(String defaultAct) {
        this.defaultAct = defaultAct;
    }


    public void getDefaultAction() {
        return this.defaultAct;
    }


    /**
     *
     * @param X: the X scale, refer the paper.
     * @param conLocation: location of container distribution.
     * @param conMips: the request from container.
     */
    public void setState(int [] X, HashMap<String, String> conLocation, HashMap<Integer, Double> conMips){
        curX = curLocation = "";
        conMips = conMips;

        /**
         * Get the state of all hosts
         */


        for (int i = 0; i < hostNum; i++)
            curX += (String.valueOf(X[i]) + "_");

    }


    public void getState() {

    }


    public void getRandAction() {

    }


    public void selectAction() {

    }


    public void observe() {

    }

    /**
     * to change the reward according to scale.
     */
    public void rewardZoom() {

    }


    /**
     * cal_reward -> getReward
     */
    public void getReward(String action) {

    }


    public void update() {

    }


    public void applyAction(String action) {

    }



}
