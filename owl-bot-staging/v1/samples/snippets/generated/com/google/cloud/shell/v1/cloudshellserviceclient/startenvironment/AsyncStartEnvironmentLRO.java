/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.shell.v1.samples;

// [START shell_v1_generated_cloudshellserviceclient_startenvironment_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.shell.v1.CloudShellServiceClient;
import com.google.cloud.shell.v1.StartEnvironmentMetadata;
import com.google.cloud.shell.v1.StartEnvironmentRequest;
import com.google.cloud.shell.v1.StartEnvironmentResponse;
import java.util.ArrayList;

public class AsyncStartEnvironmentLRO {

  public static void main(String[] args) throws Exception {
    asyncStartEnvironmentLRO();
  }

  public static void asyncStartEnvironmentLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudShellServiceClient cloudShellServiceClient = CloudShellServiceClient.create()) {
      StartEnvironmentRequest request =
          StartEnvironmentRequest.newBuilder()
              .setName("name3373707")
              .setAccessToken("accessToken-1042689291")
              .addAllPublicKeys(new ArrayList<String>())
              .build();
      OperationFuture<StartEnvironmentResponse, StartEnvironmentMetadata> future =
          cloudShellServiceClient.startEnvironmentOperationCallable().futureCall(request);
      // Do something.
      StartEnvironmentResponse response = future.get();
    }
  }
}
// [END shell_v1_generated_cloudshellserviceclient_startenvironment_lro_async]
