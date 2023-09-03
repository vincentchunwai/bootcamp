class Client {
    public static void main(String[] args) {
        TaskExecutor executor = new TaskExecutor();

        aniInterface guy = new Guy();
        guy.sleep();
        guy.speak();
        
        // Create a callback implementation
        Callback callback = result -> {
            System.out.println("Callback executed with result: " + result);
        };
        
        // Pass the callback to the executor
        executor.executeTask(callback);
    }
}

