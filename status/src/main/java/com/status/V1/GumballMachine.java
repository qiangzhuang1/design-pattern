package com.status.V1;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    /**
     * 投币
     */
    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("你不能再插入硬币了");
        }else if(state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("投入一个硬币");
        }else if(state == SOLD_OUT){
            System.out.println("你不能投入一个硬币,已经卖完了");
        }else if(state == SOLD){
            System.out.println("出售口香糖");
        }
    }

    /**
     * 退币
     */
    public void ejectQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("硬币退回");
            state = NO_QUARTER;
        }else if(state == NO_QUARTER){
            System.out.println("你没有投入硬币");
        }else if(state == SOLD){
            System.out.println("对不起,你已经转动把柄");
        }else if(state == SOLD_OUT){
            System.out.println("对不起，已售馨");
        }
    }

    /**
     * 转动把柄
     */
    public void turnCrank(){
        if(state == SOLD){
            System.out.println("Turning twice doesn`t get you another gumball");
        }else if(state == NO_QUARTER){
            System.out.println("You turned but there`s no quarter");
        }else if(state == SOLD_OUT){
            System.out.println("You turned，but there are no gumballs");
        }else if(state == HAS_QUARTER){
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        if(state ==  SOLD){
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if(count == 0){
                System.out.println("Oops，out of gumballs");
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }
        }else if(state == NO_QUARTER){
            System.out.println("you need to pay first");
        }else if(state == SOLD_OUT){
            System.out.println("No gumball dispensed");
        }else if(state == HAS_QUARTER){
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}