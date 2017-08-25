package test.rxjava.service;

import test.rxjava.db.model.Processed;
import test.rxjava.db.repo.ProcessedRepository;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbWriterObserver implements Observer<Processed> {

    @Autowired
    private ProcessedRepository processedRepository;

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(Processed value) {
        processedRepository.save(value);
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
