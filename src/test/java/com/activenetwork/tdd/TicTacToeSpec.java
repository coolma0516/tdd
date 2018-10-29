package com.activenetwork.tdd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TicTacToeSpec {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    private TicTacToe ticTacToe;

    @Before
    public final void before() {
        ticTacToe = new TicTacToe();
    }


}
