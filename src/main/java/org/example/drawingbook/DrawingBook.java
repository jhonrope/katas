package org.example.drawingbook;

class DrawingBook {


    private final int bookPages;

    public DrawingBook(int bookPages) {
        this.bookPages = bookPages;
    }

    int getMinimumTurnPages(int page) {
        return getMinimumCount(countForwards(page), countBackwards(page));
    }

    private int getMinimumCount(int forward, int backward) {
        if (backward < forward)
            return backward;
        else
            return forward;
    }

    private int countForwards(int page) {
        return page / 2;
    }

    private int countBackwards(int page) {
        int offsetIfEven = 1 - (bookPages % 2);
        return (bookPages - page + offsetIfEven) / 2;
    }
}
