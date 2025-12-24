package guru.springframework.springairag.services;

import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;
import org.springframework.stereotype.Service;

public interface OpenAIService {

    public Answer getAnswer(Question question);

}
