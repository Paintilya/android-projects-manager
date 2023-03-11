package dev.paintilya.android_projects_manager.FEL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import dev.paintilya.android_projects_manager.DAL.BankAccountSQLiteDAO;
import dev.paintilya.android_projects_manager.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BankAccountSQLiteDAO dao = new BankAccountSQLiteDAO(this);
        this.deleteDatabase("projects.db");
    }
}