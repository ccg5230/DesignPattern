package design.pattern.Command.impl;

import design.pattern.Command.AudioPlayer;
import design.pattern.Command.Command;

/**
 * 具体命令角色类:倒带
 */
public class RewindCommand implements Command {

    private AudioPlayer myAudio;

    public RewindCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.rewind();
    }

}