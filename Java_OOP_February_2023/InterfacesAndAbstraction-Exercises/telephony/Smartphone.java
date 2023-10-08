package telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {


        String browse = urls.get(0);
        urls.remove(0);
        if (browse.matches(".*\\d.*")) {
            return "Invalid URL!";
        }

        return String.format("Browsing: %s!", browse);
    }

    @Override
    public String call() {
        String call = numbers.get(0);
        numbers.remove(0);
        if (!call.matches("\\d+")) {
            return "Invalid number!";
        }

        return String.format("Calling... %s", call);
    }
}
