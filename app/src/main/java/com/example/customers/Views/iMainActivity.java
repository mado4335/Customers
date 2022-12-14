package com.example.customers.Views;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;

import com.example.customers.Models.Customer;

import java.util.List;

public interface iMainActivity {
    interface Presenter{
        void addCustomer(Customer customer);

        List<Customer> getAllCustomers();

        void refreshList();

        Location updateCoordinates(String address);

        void showCustomerData(Customer customer);

        void showOnMaps(String uriString);

        void deleteCustomer(Customer customer);
    }

    interface view{

        void onSuccess(String message);

        void onError(String message);

        void onRefresh(List<Customer> newList);

        void onCloseDialog();

        void onCoordinatesUpdate(double latitude, double longitude);

        void showCustomDialogAddUser();

        void showCustomDialogCustomerDetails(Customer customer);

        void onShowingMaps(Uri uri);
    }
}
