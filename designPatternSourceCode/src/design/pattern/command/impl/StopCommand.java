package design.pattern.Command.impl;


import design.pattern.Command.AudioPlayer;
import design.pattern.Command.Command;

/**
 * 具体命令角色类:停止
 */
public class StopCommand implements Command {
    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.stop();
    }

}