package seminar6.task1;

public class Stopwatch {
    private long startTime;
    private long milliseconds;
    private long pausedMilliseconds;
    private long allPausedMilliseconds;
    private long startPausedMilliseconds;
    private boolean isActive;
    private boolean isPaused;
    public void start(){
        isActive = true;
        isPaused = false;
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        unPause();
        milliseconds = System.currentTimeMillis() - startTime - pausedMilliseconds;
        isActive = false;
    }
    public long printCurrentTime(){
        if (isActive && !isPaused) {
            return System.currentTimeMillis() - startTime - allPausedMilliseconds;
        }
        return milliseconds;
    }
    public void pause(){
        if (isActive && !isPaused){
            milliseconds = System.currentTimeMillis() - startTime - pausedMilliseconds;
            startPausedMilliseconds = System.currentTimeMillis();
            isPaused = true;
        }

    }
    public void unPause(){
        if(isActive && isPaused){
            pausedMilliseconds = System.currentTimeMillis() - startPausedMilliseconds;
            allPausedMilliseconds += pausedMilliseconds;
            isPaused = false;
        }

    }
}
