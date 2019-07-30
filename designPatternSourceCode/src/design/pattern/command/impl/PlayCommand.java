package design.pattern.Command.impl;

import design.pattern.Command.AudioPlayer;
import design.pattern.Command.Command;

/**
 * 具体命令角色类:播放
 */
public class PlayCommand implements Command {

    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }

}
