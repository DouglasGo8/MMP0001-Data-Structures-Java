package com.udemy.data.structures.java.arrays;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Log4j2
public class AppTest {

  @Test
  public void basicArraysOps() {

    var nums = new int[10]; // allocating heap space
    // nums[2] = 5; // ArrayIndexOutOfBoundsException if array have 2 positions (new int[2]) starting in 0
    // O(1)...
    for (int i = 0; i < 10; i++)
      nums[i] = ThreadLocalRandom.current().nextInt(8, 80);
    //
    //nums[3] = 1000; // updated value of third position
    for (int num : nums) log.info(num); // enhanced version

    // linear search O(N) is not better solution
    for (int i = 0; i < 10; i++)
      if (nums[i] == 6)
        log.info("number 6 found");

  }

  @Test
  public void basicArrayListOps() {
    // Arraylist use standard array under hood, default capacity is 10
    // index by 0 as initial position
    var lists = new ArrayList<String>();

    lists.add("A");
    lists.add("B");
    lists.add("X");

    log.info(lists.get(0));
    // ------------------------
    lists.forEach(log::info);

  }
}
