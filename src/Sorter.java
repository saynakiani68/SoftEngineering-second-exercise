public class Sorter {

    public void sort(Sortable[] elements) {

        for (int j = 0; j < elements.length - 1; j++) {

            for (int i = 0; i < elements.length - 1 - j; i++) {

                if (elements[i].isGreaterThan(elements[i + 1])) {

                    Sortable temp = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = temp;
                }
            }
        }
    }
}