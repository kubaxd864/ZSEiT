package com.example.kontakty01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.CursorLoader;

import android.annotation.TargetApi;
import android.app.ListActivity;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.CursorAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    private static final int READ_CONTACTS_PERMISSIONS_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            uzyskajZgode();
        else
            pobierzKontakty();
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void uzyskajZgode() {
        if (checkSelfPermission(android.Manifest.permission.READ_CONTACTS)
                != PackageManager.PERMISSION_GRANTED) {
            if (shouldShowRequestPermissionRationale(
                    android.Manifest.permission.READ_CONTACTS)) {
            }
            requestPermissions(new String[]{android.Manifest.permission.READ_CONTACTS},
                    READ_CONTACTS_PERMISSIONS_REQUEST);
        } else
            pobierzKontakty();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if (requestCode == READ_CONTACTS_PERMISSIONS_REQUEST) {
            if (grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                pobierzKontakty();
            } else {
                Toast.makeText(this, "Brak uprawnień do odczytaniakontaktów", Toast.LENGTH_SHORT).show();
            }
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    private void pobierzKontakty() {
        Uri uriKontakty = ContactsContract.Contacts.CONTENT_URI;
        Cursor c;
        String[] polaProjekcji = new String[]{
                ContactsContract.Contacts._ID,
                ContactsContract.Contacts.DISPLAY_NAME};
        String warunekSelekcji = ContactsContract.Contacts.DISPLAY_NAME + " like ?";
        String[] argumentySelekcji = {"%ski"};
        String sortowanie = ContactsContract.Contacts.DISPLAY_NAME + " desc";
        CursorLoader cursorLoader = new CursorLoader(
                this,
                uriKontakty,
                polaProjekcji,
                warunekSelekcji,
                argumentySelekcji,
                sortowanie);
        c = cursorLoader.loadInBackground();
        String[] kolumny = new String[]{
                ContactsContract.Contacts._ID,
                ContactsContract.Contacts.DISPLAY_NAME};
        int[] kontrolki = new int[]{R.id.txtID, R.id.txtNazwa};
        SimpleCursorAdapter adapter;
        adapter = new SimpleCursorAdapter(
                this,
                R.layout.activity_main,
                c,
                kolumny,
                kontrolki,
                CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
        setListAdapter(adapter);
    }
}