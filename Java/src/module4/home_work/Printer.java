package module4.home_work;

public class Printer {
    private String queue = "";
    private int pendingPagesCount = 0;

    private int pagesCount = 0;

    public void append(String text) {
        queue += "\n" + text;
    }

    public void append(String text, String name) {
        append(text);
        queue += " Наименование документа: '" + name + "'";
    }

    public void append(String text, String name, int count) {
        append(text, name);
        queue += count + " стр.";
        pendingPagesCount += count;
        pagesCount += count;
    }

    public void clear() {
        queue = "";
    }

    public void print(String title) {
        System.out.println(title);
        if (queue == null || queue.length() == 0) {
            System.out.println("Очередь пуста");
        } else {
            System.out.println(queue);
            pendingPagesCount = 0;
            clear();
        }
    }

    public int getPendingPagesCount(){
        return pendingPagesCount;
    }

    public int getPagesCount() {
        return pagesCount;
    }
}
