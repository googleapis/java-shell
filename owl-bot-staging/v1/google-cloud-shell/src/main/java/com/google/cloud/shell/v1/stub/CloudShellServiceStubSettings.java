/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.shell.v1.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.shell.v1.AddPublicKeyMetadata;
import com.google.cloud.shell.v1.AddPublicKeyRequest;
import com.google.cloud.shell.v1.AddPublicKeyResponse;
import com.google.cloud.shell.v1.AuthorizeEnvironmentMetadata;
import com.google.cloud.shell.v1.AuthorizeEnvironmentRequest;
import com.google.cloud.shell.v1.AuthorizeEnvironmentResponse;
import com.google.cloud.shell.v1.Environment;
import com.google.cloud.shell.v1.GetEnvironmentRequest;
import com.google.cloud.shell.v1.RemovePublicKeyMetadata;
import com.google.cloud.shell.v1.RemovePublicKeyRequest;
import com.google.cloud.shell.v1.RemovePublicKeyResponse;
import com.google.cloud.shell.v1.StartEnvironmentMetadata;
import com.google.cloud.shell.v1.StartEnvironmentRequest;
import com.google.cloud.shell.v1.StartEnvironmentResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link CloudShellServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (cloudshell.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getEnvironment to 30 seconds:
 *
 * <pre>{@code
 * CloudShellServiceStubSettings.Builder cloudShellServiceSettingsBuilder =
 *     CloudShellServiceStubSettings.newBuilder();
 * cloudShellServiceSettingsBuilder
 *     .getEnvironmentSettings()
 *     .setRetrySettings(
 *         cloudShellServiceSettingsBuilder
 *             .getEnvironmentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CloudShellServiceStubSettings cloudShellServiceSettings =
 *     cloudShellServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CloudShellServiceStubSettings extends StubSettings<CloudShellServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<GetEnvironmentRequest, Environment> getEnvironmentSettings;
  private final UnaryCallSettings<StartEnvironmentRequest, Operation> startEnvironmentSettings;
  private final OperationCallSettings<
          StartEnvironmentRequest, StartEnvironmentResponse, StartEnvironmentMetadata>
      startEnvironmentOperationSettings;
  private final UnaryCallSettings<AuthorizeEnvironmentRequest, Operation>
      authorizeEnvironmentSettings;
  private final OperationCallSettings<
          AuthorizeEnvironmentRequest, AuthorizeEnvironmentResponse, AuthorizeEnvironmentMetadata>
      authorizeEnvironmentOperationSettings;
  private final UnaryCallSettings<AddPublicKeyRequest, Operation> addPublicKeySettings;
  private final OperationCallSettings<
          AddPublicKeyRequest, AddPublicKeyResponse, AddPublicKeyMetadata>
      addPublicKeyOperationSettings;
  private final UnaryCallSettings<RemovePublicKeyRequest, Operation> removePublicKeySettings;
  private final OperationCallSettings<
          RemovePublicKeyRequest, RemovePublicKeyResponse, RemovePublicKeyMetadata>
      removePublicKeyOperationSettings;

  /** Returns the object with the settings used for calls to getEnvironment. */
  public UnaryCallSettings<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
    return getEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to startEnvironment. */
  public UnaryCallSettings<StartEnvironmentRequest, Operation> startEnvironmentSettings() {
    return startEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to startEnvironment. */
  public OperationCallSettings<
          StartEnvironmentRequest, StartEnvironmentResponse, StartEnvironmentMetadata>
      startEnvironmentOperationSettings() {
    return startEnvironmentOperationSettings;
  }

  /** Returns the object with the settings used for calls to authorizeEnvironment. */
  public UnaryCallSettings<AuthorizeEnvironmentRequest, Operation> authorizeEnvironmentSettings() {
    return authorizeEnvironmentSettings;
  }

  /** Returns the object with the settings used for calls to authorizeEnvironment. */
  public OperationCallSettings<
          AuthorizeEnvironmentRequest, AuthorizeEnvironmentResponse, AuthorizeEnvironmentMetadata>
      authorizeEnvironmentOperationSettings() {
    return authorizeEnvironmentOperationSettings;
  }

  /** Returns the object with the settings used for calls to addPublicKey. */
  public UnaryCallSettings<AddPublicKeyRequest, Operation> addPublicKeySettings() {
    return addPublicKeySettings;
  }

  /** Returns the object with the settings used for calls to addPublicKey. */
  public OperationCallSettings<AddPublicKeyRequest, AddPublicKeyResponse, AddPublicKeyMetadata>
      addPublicKeyOperationSettings() {
    return addPublicKeyOperationSettings;
  }

  /** Returns the object with the settings used for calls to removePublicKey. */
  public UnaryCallSettings<RemovePublicKeyRequest, Operation> removePublicKeySettings() {
    return removePublicKeySettings;
  }

  /** Returns the object with the settings used for calls to removePublicKey. */
  public OperationCallSettings<
          RemovePublicKeyRequest, RemovePublicKeyResponse, RemovePublicKeyMetadata>
      removePublicKeyOperationSettings() {
    return removePublicKeyOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CloudShellServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcCloudShellServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "cloudshell.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(CloudShellServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected CloudShellServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getEnvironmentSettings = settingsBuilder.getEnvironmentSettings().build();
    startEnvironmentSettings = settingsBuilder.startEnvironmentSettings().build();
    startEnvironmentOperationSettings = settingsBuilder.startEnvironmentOperationSettings().build();
    authorizeEnvironmentSettings = settingsBuilder.authorizeEnvironmentSettings().build();
    authorizeEnvironmentOperationSettings =
        settingsBuilder.authorizeEnvironmentOperationSettings().build();
    addPublicKeySettings = settingsBuilder.addPublicKeySettings().build();
    addPublicKeyOperationSettings = settingsBuilder.addPublicKeyOperationSettings().build();
    removePublicKeySettings = settingsBuilder.removePublicKeySettings().build();
    removePublicKeyOperationSettings = settingsBuilder.removePublicKeyOperationSettings().build();
  }

  /** Builder for CloudShellServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<CloudShellServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<GetEnvironmentRequest, Environment>
        getEnvironmentSettings;
    private final UnaryCallSettings.Builder<StartEnvironmentRequest, Operation>
        startEnvironmentSettings;
    private final OperationCallSettings.Builder<
            StartEnvironmentRequest, StartEnvironmentResponse, StartEnvironmentMetadata>
        startEnvironmentOperationSettings;
    private final UnaryCallSettings.Builder<AuthorizeEnvironmentRequest, Operation>
        authorizeEnvironmentSettings;
    private final OperationCallSettings.Builder<
            AuthorizeEnvironmentRequest, AuthorizeEnvironmentResponse, AuthorizeEnvironmentMetadata>
        authorizeEnvironmentOperationSettings;
    private final UnaryCallSettings.Builder<AddPublicKeyRequest, Operation> addPublicKeySettings;
    private final OperationCallSettings.Builder<
            AddPublicKeyRequest, AddPublicKeyResponse, AddPublicKeyMetadata>
        addPublicKeyOperationSettings;
    private final UnaryCallSettings.Builder<RemovePublicKeyRequest, Operation>
        removePublicKeySettings;
    private final OperationCallSettings.Builder<
            RemovePublicKeyRequest, RemovePublicKeyResponse, RemovePublicKeyMetadata>
        removePublicKeyOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.UNKNOWN)));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      getEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      startEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      startEnvironmentOperationSettings = OperationCallSettings.newBuilder();
      authorizeEnvironmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      authorizeEnvironmentOperationSettings = OperationCallSettings.newBuilder();
      addPublicKeySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      addPublicKeyOperationSettings = OperationCallSettings.newBuilder();
      removePublicKeySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      removePublicKeyOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getEnvironmentSettings,
              startEnvironmentSettings,
              authorizeEnvironmentSettings,
              addPublicKeySettings,
              removePublicKeySettings);
      initDefaults(this);
    }

    protected Builder(CloudShellServiceStubSettings settings) {
      super(settings);

      getEnvironmentSettings = settings.getEnvironmentSettings.toBuilder();
      startEnvironmentSettings = settings.startEnvironmentSettings.toBuilder();
      startEnvironmentOperationSettings = settings.startEnvironmentOperationSettings.toBuilder();
      authorizeEnvironmentSettings = settings.authorizeEnvironmentSettings.toBuilder();
      authorizeEnvironmentOperationSettings =
          settings.authorizeEnvironmentOperationSettings.toBuilder();
      addPublicKeySettings = settings.addPublicKeySettings.toBuilder();
      addPublicKeyOperationSettings = settings.addPublicKeyOperationSettings.toBuilder();
      removePublicKeySettings = settings.removePublicKeySettings.toBuilder();
      removePublicKeyOperationSettings = settings.removePublicKeyOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getEnvironmentSettings,
              startEnvironmentSettings,
              authorizeEnvironmentSettings,
              addPublicKeySettings,
              removePublicKeySettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .getEnvironmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .startEnvironmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .authorizeEnvironmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .addPublicKeySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .removePublicKeySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .startEnvironmentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<StartEnvironmentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(StartEnvironmentResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(StartEnvironmentMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .authorizeEnvironmentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AuthorizeEnvironmentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  AuthorizeEnvironmentResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  AuthorizeEnvironmentMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .addPublicKeyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AddPublicKeyRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(AddPublicKeyResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(AddPublicKeyMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .removePublicKeyOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RemovePublicKeyRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(RemovePublicKeyResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(RemovePublicKeyMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to getEnvironment. */
    public UnaryCallSettings.Builder<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
      return getEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to startEnvironment. */
    public UnaryCallSettings.Builder<StartEnvironmentRequest, Operation>
        startEnvironmentSettings() {
      return startEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to startEnvironment. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            StartEnvironmentRequest, StartEnvironmentResponse, StartEnvironmentMetadata>
        startEnvironmentOperationSettings() {
      return startEnvironmentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to authorizeEnvironment. */
    public UnaryCallSettings.Builder<AuthorizeEnvironmentRequest, Operation>
        authorizeEnvironmentSettings() {
      return authorizeEnvironmentSettings;
    }

    /** Returns the builder for the settings used for calls to authorizeEnvironment. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AuthorizeEnvironmentRequest, AuthorizeEnvironmentResponse, AuthorizeEnvironmentMetadata>
        authorizeEnvironmentOperationSettings() {
      return authorizeEnvironmentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to addPublicKey. */
    public UnaryCallSettings.Builder<AddPublicKeyRequest, Operation> addPublicKeySettings() {
      return addPublicKeySettings;
    }

    /** Returns the builder for the settings used for calls to addPublicKey. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AddPublicKeyRequest, AddPublicKeyResponse, AddPublicKeyMetadata>
        addPublicKeyOperationSettings() {
      return addPublicKeyOperationSettings;
    }

    /** Returns the builder for the settings used for calls to removePublicKey. */
    public UnaryCallSettings.Builder<RemovePublicKeyRequest, Operation> removePublicKeySettings() {
      return removePublicKeySettings;
    }

    /** Returns the builder for the settings used for calls to removePublicKey. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            RemovePublicKeyRequest, RemovePublicKeyResponse, RemovePublicKeyMetadata>
        removePublicKeyOperationSettings() {
      return removePublicKeyOperationSettings;
    }

    @Override
    public CloudShellServiceStubSettings build() throws IOException {
      return new CloudShellServiceStubSettings(this);
    }
  }
}
