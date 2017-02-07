package mejia.sam.free_eventbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {
    TextView txac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
    }

    @Subscribe
    public void eventMagic (MyEvent myEvent){
        Toast.makeText(this,myEvent.getMessage(), Toast.LENGTH_SHORT).show();
        txac = (TextView) findViewById(R.id.tvac);
        txac.setText(myEvent.getMessage());
    }
}
