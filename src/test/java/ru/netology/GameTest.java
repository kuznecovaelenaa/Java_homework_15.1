package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GameTest {
    Player playerName1 = new Player(1, "Alex", 100);
    Player playerName2 = new Player(2, "Bill", 150);
    Player playerName3 = new Player(3, "Anna", 50);
    Player playerName4 = new Player(4, "Helen", 100);
    Player playerName5 = new Player(5, "Nik", 150);
    Player playerName6 = new Player(6, "Leo", -150);

    Game game = new Game();

    @Test
    void firstTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName1);
        game.register(playerName2);
        game.round("Alex", "Bill");

        int actual = game.round("Alex", "Bill");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void secondTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName1);
        game.round("Alex", "Bill");

        int actual = game.round("Alex", "Bill");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void thirdTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName2);
        game.register(playerName5);
        game.round("Bill", "Nik");

        int actual = game.round("Bill", "Nik");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fourthTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName4);
        game.register(playerName3);
        game.round("Helen", "Anna");

        int actual = game.round("Helen", "Anna");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fifthTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName6);
        game.register(playerName3);
        game.round("Leo", "Anna");

        int actual = game.round("Leo", "Anna");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sixthTest() {
        Collection<Player> players = new ArrayList<>();
        game.register(playerName2);
        game.round("Alex", "Bill");

        int actual = game.round("Alex", "Bill");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
