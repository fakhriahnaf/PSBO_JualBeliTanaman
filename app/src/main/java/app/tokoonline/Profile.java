package app.tokoonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView txtEdit;
    LinearLayout linearStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txtEdit     = findViewById(R.id.txtEdit);
        linearStore = findViewById(R.id.linearStore);

        txtEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(txtEdit, "Edit Profil", Snackbar.LENGTH_LONG).show();
            }
        });
        linearStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, Store.class));
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Profil");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
