package Votes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewTest {
    public static void main(String[] args) {
        Voter voter1 = new Voter();
        voter1.name = "ram";
        voter1.aadharNo = "2345";
        voter1.status = "yes";

        Voter voter2 = new Voter();
        voter2.name = "balu";
        voter2.aadharNo = "76543";
        voter2.status = "no";

        Voter voter3 = new Voter();
        voter3.name = "yogi";
        voter3.aadharNo = "12345";
        voter3.status = "yes";

        Voter voter4 = new Voter();
        voter4.name = "chaitu";
        voter4.aadharNo = "23456";
        voter4.status = "yes";

        Voter voter5 = new Voter();
        voter5.name = "revanth";
        voter5.aadharNo = "23456";
        voter5.status = "yes";


        List<Voter> voterList = new ArrayList<>();

        voterList.add(voter1);
        voterList.add(voter2);
        voterList.add(voter3);
        voterList.add(voter4);
        voterList.add(voter5);

        Iterator<Voter> iterator = voterList.iterator();
        List<String> seenAdharNo = new ArrayList<>();
        for (; iterator.hasNext(); ) {
            Voter voterIterator = iterator.next();
            if (!seenAdharNo.contains(voterIterator.aadharNo)) {
                seenAdharNo.add(voterIterator.aadharNo);
                if (voterIterator.status.equals("yes")) {
                    System.out.println(voterIterator.name + "has casted vote");
                }

            } else {
                System.out.println(voterIterator.name + "has not casted vote");


                System.out.println(voterIterator.name + "already in list but this is duplicate");
            }
        }


    }


    }

