package test;

import game.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int card_number = 12;
        boolean gameOver = false;
        String winner = "";
        Scanner sc = new Scanner(System.in);
        Player player1 = new Player("aimad", 20);
        Player player2 = new Player("ossama", 20);
        Sortileges stopCard = new Sortileges("stopCard", 10, "sortileges");
        Sortileges reverseCard = new Sortileges("reverseCard", 10, "sortileges");
        CreatureCard attackCard = new CreatureCard("attackCard", 10, "creatureCard");
        CreatureCard lifeCard = new CreatureCard("lifeCard", 10, "creatureCard");
        TerrainCard blackCard = new TerrainCard("blackCard", 8, "terrainCard");
        TerrainCard redCard = new TerrainCard("redCard", 7, "terrainCard");
        TerrainCard whiteCard = new TerrainCard("whiteCard", 6, "terrainCard");
        TerrainCard greenCard = new TerrainCard("greenCard", 5, "terrainCard");
        TerrainCard blueCard = new TerrainCard("blueCard", 4, "terrainCard");


        // create array list that wil contain all cards
        ArrayList<Card> c = new ArrayList<>();
/*
        blackCard.setColor("black");
        redCard.setColor("red");
        whiteCard.setColor("white");
        greenCard.setColor("green");
        blueCard.setColor("blue");
        stopCard.setStop("stop attack");
        reverseCard.setReverse("reverse attack");
        lifeCard.setPoint_vie(10);
        attackCard.setPoint_degat(10);

 */

        c.add(blackCard);
        c.add(redCard);
        c.add(whiteCard);
        c.add(greenCard);
        c.add(blueCard);
        c.add(stopCard);
        c.add(reverseCard);
        c.add(attackCard);
        c.add(lifeCard);


        // player 1 choose his cards
        for (int i = 0; i < card_number; i++) {
            int index = (1 + (int)(Math.random() * 8));
            player1.playerCard.add(c.get(index));
        }

        // player 2 choose his cards
        for (int i = 0; i < card_number; i++) {
            int index = (1 + (int)(Math.random() * 8));
            player2.playerCard.add(c.get(index));
        }

        while (!gameOver){
            System.out.println(player1.getPoint() + " ## " + player2.getPoint());
            System.out.println("##########################################################");

            System.out.println("player "+player1.getName()+" turn choose card : ");
            int n = sc.nextInt();
            Card player_one_card = player1.playerCard.get(n);
            System.out.println(player_one_card.getName());
            System.out.println("Available cards :");
            for (int j = 0; j < player1.playerCard.size(); j++) {
                System.out.println(player1.playerCard.get(j) +" card number "+j +" - ");
            }

            System.out.println("##########################################################");

            System.out.println("player "+player2.getName()+" turn choose card : ");
            int m = sc.nextInt();
            Card player_two_card = player1.playerCard.get(m);
            System.out.println(player_two_card.getName());
            System.out.println("Available cards :");
            for (int k = 0; k < player2.playerCard.size(); k++) {
                System.out.println(player2.playerCard.get(k) +" card number "+k +" - ");
            }



            if (player_one_card.getType().equals("sortileges")){
                int point = player2.getPoint();
                player2.setPoint(point-5);
            } else if(player_two_card.getType().equals("sortileges")) {
                int point = player1.getPoint();
                player1.setPoint(point-5);
            } else if (player_one_card.getType().equals("creatureCard") && player_two_card.getType().equals("terrainCard") ){
                int point = player2.getPoint();
                player2.setPoint(point-5);
            } else if (player_two_card.getType().equals("creatureCard") && player_one_card.getType().equals("terrainCard") ){
                int point = player1.getPoint();
                player1.setPoint(point-5);
            } else if (player_two_card.getType().equals("creatureCard") && player_one_card.getType().equals("creatureCard")){
                if (player_one_card.getName().equals("lifeCard") && !player_two_card.getName().equals("lifeCard")){
                    int point = player1.getPoint();
                    player1.setPoint(point+5);
                } else if (!player_one_card.getName().equals("lifeCard") && player_two_card.getName().equals("lifeCard")){
                    int point = player2.getPoint();
                    player2.setPoint(point+2);
                } else{
                    player2.setPoint(player2.getPoint()+1);
                    player2.setPoint(player2.getPoint()+1);
                }
            } else if (player_two_card.getType().equals(player_one_card.getType())){
                if (player_one_card.getValue() > player_two_card.getValue()){
                    int point = player2.getPoint();
                    player2.setPoint(point-5);
                } else {
                    int point = player1.getPoint();
                    player1.setPoint(point-5);
                }
            }

            player1.playerCard.remove(player_one_card);
            player2.playerCard.remove(player_two_card);

            // check result
            if (player1.getPoint() <= 0 ){
                winner = player2.getName();
                gameOver = true;
            } else if (player2.getPoint() <= 0){
                winner = player1.getName();
                gameOver = true;
            }

        }

        System.out.println("The Winner is : "+ winner );


    }

}
