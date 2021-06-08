public class Worker{
    private OnTaskDoneListener callBack;
    private OnTaskErrorListener errorListener;

    public Worker(OnTaskDoneListener callBack, OnTaskErrorListener errorListener) {
        this.callBack = callBack;
        this.errorListener = errorListener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33){
                errorListener.onError("Task" + i + " is not done");
            }
            callBack.onDone("Task" + i + " is done");
        }
    }
}
