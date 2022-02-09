package com.atsistemas.formacion.base.spring.core.example4.model;

import java.time.LocalDate;

public interface ITodo {

    long getId();

    String getSummary();

    void setSummary(String summary);

    void setDescription(String description);

    String getDescription();

    boolean isDone();

    void setDone(boolean isDone);

    LocalDate getDueDate();

    void setDueDate(LocalDate dueDate);

    ITodo copy();

}