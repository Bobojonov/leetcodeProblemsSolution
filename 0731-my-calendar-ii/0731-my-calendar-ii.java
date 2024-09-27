class MyCalendarTwo {

    private final TreeMap<Integer, Integer> books;

    public MyCalendarTwo() {
        books = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        books.put(start, books.getOrDefault(start, 0) + 1);
        books.put(end, books.getOrDefault(end, 0) - 1);
        int cnt = 0;
        for (Map.Entry<Integer, Integer> map : books.entrySet()) {
            cnt += map.getValue();
            if (cnt > 2) {
                books.put(start, books.get(start) - 1);
                if (books.get(start) == 0) books.remove(start);
                books.put(end, books.get(end) + 1);
                if (books.get(end) == 0) books.remove(end);
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */