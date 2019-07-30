package design.pattern.Command;

/**
 * 请求者角色，由键盘类扮演
 */
public class Keypad {
    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;
    private Command pauseCommand;

    public Keypad(Command playCommand,Command rewindCommand,Command stopCommand,Command pauseCommand ) {
        this.playCommand = playCommand;
        this.rewindCommand = rewindCommand;
        this.stopCommand = stopCommand;
        this.pauseCommand = pauseCommand;
    }

    /**
     * 执行播放方法
     */
    public void play(){
        playCommand.execute();
    }
    /**
     * 执行倒带方法
     */
    public void rewind(){
        rewindCommand.execute();
    }
    /**
     * 执行停止方法
     */
    public void stop(){
        stopCommand.execute();
    }

    /**
     * 执行暂停方法
     */
    public void pause(){
        pauseCommand.execute();
    }
}
