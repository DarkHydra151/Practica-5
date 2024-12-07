package com.example;

public class FiniteAutomaton
{
    public static final int STATE_0 = 0;
    public static final int STATE_1 = 1;
    public static final int STATE_2 = 2;
    public static final int STATE_3 = 3;
    public static final int STATE_F = 4;

    public int processString(String input)
    {
        int state = STATE_0;
        for (char c : input.toCharArray())
        {
            state = transition(state, c);
            if (state == STATE_F)
            {
                break;
            }
        }
        return state;
    }

    private int transition(int state, char inputChar)
    {
        switch (state)
        {
            case STATE_0:
                if (inputChar == 'T') return STATE_1;
                return STATE_0;
            case STATE_1:
                if (inputChar == 'E') return STATE_2;
                if (inputChar == 'T') return STATE_1;
                return STATE_0;
            case STATE_2:
                if (inputChar == 'S') return STATE_3;
                if (inputChar == 'T') return STATE_1;
                return STATE_0;
            case STATE_3:
                if (inputChar == 'T') return STATE_F;
                return STATE_0;
            case STATE_F:
                return STATE_F;
            default:
                return STATE_0;
        }
    }






}
