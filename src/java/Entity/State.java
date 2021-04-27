/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author my laptop
 */
public class State {
    private int idstate;
    private String statename;

    public State() {
    }

    public State(int idstate, String statename) {
        this.idstate = idstate;
        this.statename = statename;
    }

    public int getIdstate() {
        return idstate;
    }

    public void setIdstate(int idstate) {
        this.idstate = idstate;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }
    
}
