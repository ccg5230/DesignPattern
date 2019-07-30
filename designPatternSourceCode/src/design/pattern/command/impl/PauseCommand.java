package design.pattern.Command.impl;

import design.pattern.Command.AudioPlayer;
import design.pattern.Command.Command;

/**
 * 具体命令角色类:暂停
 */
public class PauseCommand implements Command {
    private AudioPlayer myAudio;

    public PauseCommand(AudioPlayer audioPlayer) {
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.pause();
    }
}
