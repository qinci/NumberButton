package ren.qinc.numberbutton_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ren.qinc.numberbutton.NumberButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberButton numberButton = (NumberButton) findViewById(R.id.number_button);
        assert numberButton != null;
        numberButton.setBuyMax(5)
                .setInventory(6)
                .setCurrentNumber(10)
                .setOnWarnListener(new NumberButton.OnWarnListener() {
                    @Override
                    public void onWarningForInventory(int inventory) {
                        Toast.makeText(MainActivity.this, "当前库存:" + inventory, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onWarningForBuyMax(int buyMax) {
                        Toast.makeText(MainActivity.this, "超过最大购买数:" + buyMax, Toast.LENGTH_SHORT).show();
                    }
                });

    }
}
