/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia2.conexion;

import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.StorageOptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author prisc
 */
public class Archivo {

    public void uploadObject( /*String projectId, String bucketName, String objectName, String filePath*/) throws IOException {
        // The ID of your GCP project
        String projectId = "quiet-vector-356113";

        // The ID of your GCS bucket
        String bucketName = "mi_bucket_practica1";

        // The ID of your GCS object
        String objectName = "ista";

        // The path to your file to upload
        String filePath = "C:\\Users\\prisc\\Downloads\\ista.png";

        com.google.cloud.storage.Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();
        BlobId blobId = BlobId.of(bucketName, objectName);
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
        storage.create(blobInfo, Files.readAllBytes(Paths.get(filePath)));

        System.out.println(
                "File " + filePath + " uploaded to bucket " + bucketName + " as " + objectName);
    }

}
