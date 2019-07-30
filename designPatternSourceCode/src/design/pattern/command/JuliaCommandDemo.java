package design.pattern.Command;

import design.pattern.Command.impl.PlayCommand;
import design.pattern.Command.impl.RewindCommand;
import design.pattern.Command.impl.StopCommand;

/**
 * 客户端角色，由茱丽小女孩扮演
 */
public class JuliaCommandDemo {
    public static void main(String[]args){
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        Command pauseCommand = new StopCommand(audioPlayer);

        //创建请求者对象
        Keypad keypad = new Keypad(playCommand,rewindCommand,stopCommand,pauseCommand);
        //测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
    }
}
