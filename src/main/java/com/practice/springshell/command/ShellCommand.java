package com.practice.springshell.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ShellCommand {

  @ShellMethod(key = "hello", value = "I will say hello")
  public String hello(@ShellOption(value = "-n", defaultValue = "World") String arg) {
    return "Hello, " + arg + "!";
  }
  
}
