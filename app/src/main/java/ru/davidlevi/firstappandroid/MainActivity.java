package ru.davidlevi.firstappandroid;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements InterfaceGreeting {
    private TextView textView;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Метод setContentView привязывает макет (layout) к активити
        setContentView(R.layout.activity_main);

        // Метод findViewById ищет виджет по id
        textView = findViewById(R.id.txtview_greeting);

        // Метод getResources предоставляет доступ к ресурсам приложения
        resources = getResources();

        PhraseBuilder phraseBuilder = new PhraseBuilder(this);
        textView.setText(phraseBuilder.get());
    }

    @Override
    public String getMorning() {
        return resources.getString(R.string.morning);
    }

    @Override
    public String getEvening() {
        return resources.getString(R.string.evening);
    }

    @Override
    public String getHello() {
        return resources.getString(R.string.hello);
    }
}
