package observer_design;

public interface Subject {
    /**
     * @brief Add an observer to the subject.
     * @param observer The observer to be added.
     */
    void addObserver(Observer observer);

    /**
     * @brief Remove an observer from the subject.
     * @param observer The observer to be removed.
     */
    void removeObserver(Observer observer);

    /**
     * @brief Notify all observers about a change in the subject.
     */
    void notifyObservers();
}
