class Printer extends Thread {
    String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (char ch : message.toCharArray()) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            System.out.print(ch);

        }
    }
}
