package fpoly.huyndph40487.qlda_bantrsua;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


import fpoly.huyndph40487.qlda_bantrsua.view.HomeFragment;

public class SignInActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    String TAG = "ZZZZ";
    private LinearLayout layoutSignUp;
    Button btnSignIn;
    TextInputLayout ed_email,ed_pass;
    private ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initUi();
        initListener();
        FirebaseApp.initializeApp(SignInActivity.this);

    }

    private void initUi(){
        ed_email = findViewById(R.id.ed_email_signin);
        ed_pass = findViewById(R.id.ed_pass_signin);
        progressDialog = new ProgressDialog(this);
        btnSignIn = findViewById(R.id.btn_signin);
        layoutSignUp = findViewById(R.id.layout_sign_up);
    }

    private void initListener() {
        layoutSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSignIn();
            }
        });
    }

    private void onClickSignIn() {
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        String email = ed_email.getEditText().getText().toString().trim();
        String password = ed_pass.getEditText().getText().toString().trim();
        progressDialog.show();
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                            startActivity(intent);
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(SignInActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }

}
