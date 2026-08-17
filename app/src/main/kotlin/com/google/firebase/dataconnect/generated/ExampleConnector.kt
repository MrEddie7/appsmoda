
@file:Suppress(
  "KotlinRedundantDiagnosticSuppress",
  "PropertyName",
  "MayBeConstant",
  "RedundantVisibilityModifier",
  "RedundantCompanionReference",
  "RemoveEmptyClassBody",
  "SpellCheckingInspection",
  "unused",
)

package com.google.firebase.dataconnect.generated

import com.google.firebase.dataconnect.getInstance as _fdcGetInstance
import kotlin.time.Duration.Companion.milliseconds as _milliseconds

public interface ExampleConnector : com.google.firebase.dataconnect.generated.GeneratedConnector<ExampleConnector> {
  override val dataConnect: com.google.firebase.dataconnect.FirebaseDataConnect

  
    public val createBookmark: CreateBookmarkMutation
  
    public val createContribution: CreateContributionMutation
  
    public val createEra: CreateEraMutation
  
    public val createGarment: CreateGarmentMutation
  
    public val createUser: CreateUserMutation
  
    public val deleteBookmark: DeleteBookmarkMutation
  
    public val deleteContribution: DeleteContributionMutation
  
    public val deleteEra: DeleteEraMutation
  
    public val deleteGarment: DeleteGarmentMutation
  
    public val deleteUser: DeleteUserMutation
  
    public val getEra: GetEraQuery
  
    public val getGarment: GetGarmentQuery
  
    public val getMyBookmarks: GetMyBookmarksQuery
  
    public val getMyProfile: GetMyProfileQuery
  
    public val listEras: ListErasQuery
  
    public val listGarments: ListGarmentsQuery
  
    public val listMyContributions: ListMyContributionsQuery
  
    public val listUsers: ListUsersQuery
  
    public val updateContribution: UpdateContributionMutation
  
    public val updateEra: UpdateEraMutation
  
    public val updateGarment: UpdateGarmentMutation
  
    public val updateUser: UpdateUserMutation
  

  public companion object {
    @Suppress("MemberVisibilityCanBePrivate")
    public val config: com.google.firebase.dataconnect.ConnectorConfig = com.google.firebase.dataconnect.ConnectorConfig(
      connector = "example",
      location = "us-east4",
      serviceId = "appmoda",
    )

    public fun getInstance(
      dataConnect: com.google.firebase.dataconnect.FirebaseDataConnect
    ):ExampleConnector = synchronized(instances) {
      instances.getOrPut(dataConnect) {
        ExampleConnectorImpl(dataConnect)
      }
    }

    private val instances = java.util.WeakHashMap<com.google.firebase.dataconnect.FirebaseDataConnect, ExampleConnectorImpl>()

    
    public val defaultCacheSettings: com.google.firebase.dataconnect.CacheSettings =
      com.google.firebase.dataconnect.CacheSettings(
        
        
      )

    public val defaultDataConnectSettings: com.google.firebase.dataconnect.DataConnectSettings =
      com.google.firebase.dataconnect.DataConnectSettings(
        cacheSettings = defaultCacheSettings,
      )
    
  }
}

public val ExampleConnector.Companion.instance:ExampleConnector
  get() = getInstance(com.google.firebase.dataconnect.FirebaseDataConnect._fdcGetInstance(
    config, defaultDataConnectSettings
  ))

public fun ExampleConnector.Companion.getInstance(
  settings: com.google.firebase.dataconnect.DataConnectSettings = defaultDataConnectSettings
):ExampleConnector =
  getInstance(com.google.firebase.dataconnect.FirebaseDataConnect._fdcGetInstance(config, settings))

public fun ExampleConnector.Companion.getInstance(
  app: com.google.firebase.FirebaseApp,
  settings: com.google.firebase.dataconnect.DataConnectSettings = defaultDataConnectSettings
):ExampleConnector =
  getInstance(com.google.firebase.dataconnect.FirebaseDataConnect._fdcGetInstance(app, config, settings))

private class ExampleConnectorImpl(
  override val dataConnect: com.google.firebase.dataconnect.FirebaseDataConnect
) : ExampleConnector {
  
    override val createBookmark by lazy(LazyThreadSafetyMode.PUBLICATION) {
      CreateBookmarkMutationImpl(this)
    }
  
    override val createContribution by lazy(LazyThreadSafetyMode.PUBLICATION) {
      CreateContributionMutationImpl(this)
    }
  
    override val createEra by lazy(LazyThreadSafetyMode.PUBLICATION) {
      CreateEraMutationImpl(this)
    }
  
    override val createGarment by lazy(LazyThreadSafetyMode.PUBLICATION) {
      CreateGarmentMutationImpl(this)
    }
  
    override val createUser by lazy(LazyThreadSafetyMode.PUBLICATION) {
      CreateUserMutationImpl(this)
    }
  
    override val deleteBookmark by lazy(LazyThreadSafetyMode.PUBLICATION) {
      DeleteBookmarkMutationImpl(this)
    }
  
    override val deleteContribution by lazy(LazyThreadSafetyMode.PUBLICATION) {
      DeleteContributionMutationImpl(this)
    }
  
    override val deleteEra by lazy(LazyThreadSafetyMode.PUBLICATION) {
      DeleteEraMutationImpl(this)
    }
  
    override val deleteGarment by lazy(LazyThreadSafetyMode.PUBLICATION) {
      DeleteGarmentMutationImpl(this)
    }
  
    override val deleteUser by lazy(LazyThreadSafetyMode.PUBLICATION) {
      DeleteUserMutationImpl(this)
    }
  
    override val getEra by lazy(LazyThreadSafetyMode.PUBLICATION) {
      GetEraQueryImpl(this)
    }
  
    override val getGarment by lazy(LazyThreadSafetyMode.PUBLICATION) {
      GetGarmentQueryImpl(this)
    }
  
    override val getMyBookmarks by lazy(LazyThreadSafetyMode.PUBLICATION) {
      GetMyBookmarksQueryImpl(this)
    }
  
    override val getMyProfile by lazy(LazyThreadSafetyMode.PUBLICATION) {
      GetMyProfileQueryImpl(this)
    }
  
    override val listEras by lazy(LazyThreadSafetyMode.PUBLICATION) {
      ListErasQueryImpl(this)
    }
  
    override val listGarments by lazy(LazyThreadSafetyMode.PUBLICATION) {
      ListGarmentsQueryImpl(this)
    }
  
    override val listMyContributions by lazy(LazyThreadSafetyMode.PUBLICATION) {
      ListMyContributionsQueryImpl(this)
    }
  
    override val listUsers by lazy(LazyThreadSafetyMode.PUBLICATION) {
      ListUsersQueryImpl(this)
    }
  
    override val updateContribution by lazy(LazyThreadSafetyMode.PUBLICATION) {
      UpdateContributionMutationImpl(this)
    }
  
    override val updateEra by lazy(LazyThreadSafetyMode.PUBLICATION) {
      UpdateEraMutationImpl(this)
    }
  
    override val updateGarment by lazy(LazyThreadSafetyMode.PUBLICATION) {
      UpdateGarmentMutationImpl(this)
    }
  
    override val updateUser by lazy(LazyThreadSafetyMode.PUBLICATION) {
      UpdateUserMutationImpl(this)
    }
  

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun operations(): List<com.google.firebase.dataconnect.generated.GeneratedOperation<ExampleConnector, *, *>> =
    queries() + mutations()

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun mutations(): List<com.google.firebase.dataconnect.generated.GeneratedMutation<ExampleConnector, *, *>> =
    listOf(
      createBookmark,
        createContribution,
        createEra,
        createGarment,
        createUser,
        deleteBookmark,
        deleteContribution,
        deleteEra,
        deleteGarment,
        deleteUser,
        updateContribution,
        updateEra,
        updateGarment,
        updateUser,
        
    )

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun queries(): List<com.google.firebase.dataconnect.generated.GeneratedQuery<ExampleConnector, *, *>> =
    listOf(
      getEra,
        getGarment,
        getMyBookmarks,
        getMyProfile,
        listEras,
        listGarments,
        listMyContributions,
        listUsers,
        
    )

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun copy(dataConnect: com.google.firebase.dataconnect.FirebaseDataConnect) =
    ExampleConnectorImpl(dataConnect)

  override fun equals(other: Any?): Boolean =
    other is ExampleConnectorImpl &&
    other.dataConnect == dataConnect

  override fun hashCode(): Int =
    java.util.Objects.hash(
      "ExampleConnectorImpl",
      dataConnect,
    )

  override fun toString(): String =
    "ExampleConnectorImpl(dataConnect=$dataConnect)"
}



private open class ExampleConnectorGeneratedQueryImpl<Data, Variables>(
  override val connector: ExampleConnector,
  override val operationName: String,
  override val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data>,
  override val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables>,
) : com.google.firebase.dataconnect.generated.GeneratedQuery<ExampleConnector, Data, Variables> {

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun copy(
    connector: ExampleConnector,
    operationName: String,
    dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data>,
    variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables>,
  ) =
    ExampleConnectorGeneratedQueryImpl(
      connector, operationName, dataDeserializer, variablesSerializer
    )

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun <NewVariables> withVariablesSerializer(
    variablesSerializer: kotlinx.serialization.SerializationStrategy<NewVariables>
  ) =
    ExampleConnectorGeneratedQueryImpl(
      connector, operationName, dataDeserializer, variablesSerializer
    )

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun <NewData> withDataDeserializer(
    dataDeserializer: kotlinx.serialization.DeserializationStrategy<NewData>
  ) =
    ExampleConnectorGeneratedQueryImpl(
      connector, operationName, dataDeserializer, variablesSerializer
    )

  override fun equals(other: Any?): Boolean =
    other is ExampleConnectorGeneratedQueryImpl<*,*> &&
    other.connector == connector &&
    other.operationName == operationName &&
    other.dataDeserializer == dataDeserializer &&
    other.variablesSerializer == variablesSerializer

  override fun hashCode(): Int =
    java.util.Objects.hash(
      "ExampleConnectorGeneratedQueryImpl",
      connector, operationName, dataDeserializer, variablesSerializer
    )

  override fun toString(): String =
    "ExampleConnectorGeneratedQueryImpl(" +
    "operationName=$operationName, " +
    "dataDeserializer=$dataDeserializer, " +
    "variablesSerializer=$variablesSerializer, " +
    "connector=$connector)"
}

private open class ExampleConnectorGeneratedMutationImpl<Data, Variables>(
  override val connector: ExampleConnector,
  override val operationName: String,
  override val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data>,
  override val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables>,
) : com.google.firebase.dataconnect.generated.GeneratedMutation<ExampleConnector, Data, Variables> {

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun copy(
    connector: ExampleConnector,
    operationName: String,
    dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data>,
    variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables>,
  ) =
    ExampleConnectorGeneratedMutationImpl(
      connector, operationName, dataDeserializer, variablesSerializer
    )

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun <NewVariables> withVariablesSerializer(
    variablesSerializer: kotlinx.serialization.SerializationStrategy<NewVariables>
  ) =
    ExampleConnectorGeneratedMutationImpl(
      connector, operationName, dataDeserializer, variablesSerializer
    )

  @com.google.firebase.dataconnect.ExperimentalFirebaseDataConnect
  override fun <NewData> withDataDeserializer(
    dataDeserializer: kotlinx.serialization.DeserializationStrategy<NewData>
  ) =
    ExampleConnectorGeneratedMutationImpl(
      connector, operationName, dataDeserializer, variablesSerializer
    )

  override fun equals(other: Any?): Boolean =
    other is ExampleConnectorGeneratedMutationImpl<*,*> &&
    other.connector == connector &&
    other.operationName == operationName &&
    other.dataDeserializer == dataDeserializer &&
    other.variablesSerializer == variablesSerializer

  override fun hashCode(): Int =
    java.util.Objects.hash(
      "ExampleConnectorGeneratedMutationImpl",
      connector, operationName, dataDeserializer, variablesSerializer
    )

  override fun toString(): String =
    "ExampleConnectorGeneratedMutationImpl(" +
    "operationName=$operationName, " +
    "dataDeserializer=$dataDeserializer, " +
    "variablesSerializer=$variablesSerializer, " +
    "connector=$connector)"
}



private class CreateBookmarkMutationImpl(
  connector: ExampleConnector
):
  CreateBookmarkMutation,
  ExampleConnectorGeneratedMutationImpl<
      CreateBookmarkMutation.Data,
      CreateBookmarkMutation.Variables
  >(
    connector,
    CreateBookmarkMutation.Companion.operationName,
    CreateBookmarkMutation.Companion.dataDeserializer,
    CreateBookmarkMutation.Companion.variablesSerializer,
  )


private class CreateContributionMutationImpl(
  connector: ExampleConnector
):
  CreateContributionMutation,
  ExampleConnectorGeneratedMutationImpl<
      CreateContributionMutation.Data,
      CreateContributionMutation.Variables
  >(
    connector,
    CreateContributionMutation.Companion.operationName,
    CreateContributionMutation.Companion.dataDeserializer,
    CreateContributionMutation.Companion.variablesSerializer,
  )


private class CreateEraMutationImpl(
  connector: ExampleConnector
):
  CreateEraMutation,
  ExampleConnectorGeneratedMutationImpl<
      CreateEraMutation.Data,
      Unit
  >(
    connector,
    CreateEraMutation.Companion.operationName,
    CreateEraMutation.Companion.dataDeserializer,
    CreateEraMutation.Companion.variablesSerializer,
  )


private class CreateGarmentMutationImpl(
  connector: ExampleConnector
):
  CreateGarmentMutation,
  ExampleConnectorGeneratedMutationImpl<
      CreateGarmentMutation.Data,
      CreateGarmentMutation.Variables
  >(
    connector,
    CreateGarmentMutation.Companion.operationName,
    CreateGarmentMutation.Companion.dataDeserializer,
    CreateGarmentMutation.Companion.variablesSerializer,
  )


private class CreateUserMutationImpl(
  connector: ExampleConnector
):
  CreateUserMutation,
  ExampleConnectorGeneratedMutationImpl<
      CreateUserMutation.Data,
      CreateUserMutation.Variables
  >(
    connector,
    CreateUserMutation.Companion.operationName,
    CreateUserMutation.Companion.dataDeserializer,
    CreateUserMutation.Companion.variablesSerializer,
  )


private class DeleteBookmarkMutationImpl(
  connector: ExampleConnector
):
  DeleteBookmarkMutation,
  ExampleConnectorGeneratedMutationImpl<
      DeleteBookmarkMutation.Data,
      DeleteBookmarkMutation.Variables
  >(
    connector,
    DeleteBookmarkMutation.Companion.operationName,
    DeleteBookmarkMutation.Companion.dataDeserializer,
    DeleteBookmarkMutation.Companion.variablesSerializer,
  )


private class DeleteContributionMutationImpl(
  connector: ExampleConnector
):
  DeleteContributionMutation,
  ExampleConnectorGeneratedMutationImpl<
      DeleteContributionMutation.Data,
      DeleteContributionMutation.Variables
  >(
    connector,
    DeleteContributionMutation.Companion.operationName,
    DeleteContributionMutation.Companion.dataDeserializer,
    DeleteContributionMutation.Companion.variablesSerializer,
  )


private class DeleteEraMutationImpl(
  connector: ExampleConnector
):
  DeleteEraMutation,
  ExampleConnectorGeneratedMutationImpl<
      DeleteEraMutation.Data,
      DeleteEraMutation.Variables
  >(
    connector,
    DeleteEraMutation.Companion.operationName,
    DeleteEraMutation.Companion.dataDeserializer,
    DeleteEraMutation.Companion.variablesSerializer,
  )


private class DeleteGarmentMutationImpl(
  connector: ExampleConnector
):
  DeleteGarmentMutation,
  ExampleConnectorGeneratedMutationImpl<
      DeleteGarmentMutation.Data,
      DeleteGarmentMutation.Variables
  >(
    connector,
    DeleteGarmentMutation.Companion.operationName,
    DeleteGarmentMutation.Companion.dataDeserializer,
    DeleteGarmentMutation.Companion.variablesSerializer,
  )


private class DeleteUserMutationImpl(
  connector: ExampleConnector
):
  DeleteUserMutation,
  ExampleConnectorGeneratedMutationImpl<
      DeleteUserMutation.Data,
      Unit
  >(
    connector,
    DeleteUserMutation.Companion.operationName,
    DeleteUserMutation.Companion.dataDeserializer,
    DeleteUserMutation.Companion.variablesSerializer,
  )


private class GetEraQueryImpl(
  connector: ExampleConnector
):
  GetEraQuery,
  ExampleConnectorGeneratedQueryImpl<
      GetEraQuery.Data,
      GetEraQuery.Variables
  >(
    connector,
    GetEraQuery.Companion.operationName,
    GetEraQuery.Companion.dataDeserializer,
    GetEraQuery.Companion.variablesSerializer,
  )


private class GetGarmentQueryImpl(
  connector: ExampleConnector
):
  GetGarmentQuery,
  ExampleConnectorGeneratedQueryImpl<
      GetGarmentQuery.Data,
      GetGarmentQuery.Variables
  >(
    connector,
    GetGarmentQuery.Companion.operationName,
    GetGarmentQuery.Companion.dataDeserializer,
    GetGarmentQuery.Companion.variablesSerializer,
  )


private class GetMyBookmarksQueryImpl(
  connector: ExampleConnector
):
  GetMyBookmarksQuery,
  ExampleConnectorGeneratedQueryImpl<
      GetMyBookmarksQuery.Data,
      Unit
  >(
    connector,
    GetMyBookmarksQuery.Companion.operationName,
    GetMyBookmarksQuery.Companion.dataDeserializer,
    GetMyBookmarksQuery.Companion.variablesSerializer,
  )


private class GetMyProfileQueryImpl(
  connector: ExampleConnector
):
  GetMyProfileQuery,
  ExampleConnectorGeneratedQueryImpl<
      GetMyProfileQuery.Data,
      Unit
  >(
    connector,
    GetMyProfileQuery.Companion.operationName,
    GetMyProfileQuery.Companion.dataDeserializer,
    GetMyProfileQuery.Companion.variablesSerializer,
  )


private class ListErasQueryImpl(
  connector: ExampleConnector
):
  ListErasQuery,
  ExampleConnectorGeneratedQueryImpl<
      ListErasQuery.Data,
      Unit
  >(
    connector,
    ListErasQuery.Companion.operationName,
    ListErasQuery.Companion.dataDeserializer,
    ListErasQuery.Companion.variablesSerializer,
  )


private class ListGarmentsQueryImpl(
  connector: ExampleConnector
):
  ListGarmentsQuery,
  ExampleConnectorGeneratedQueryImpl<
      ListGarmentsQuery.Data,
      Unit
  >(
    connector,
    ListGarmentsQuery.Companion.operationName,
    ListGarmentsQuery.Companion.dataDeserializer,
    ListGarmentsQuery.Companion.variablesSerializer,
  )


private class ListMyContributionsQueryImpl(
  connector: ExampleConnector
):
  ListMyContributionsQuery,
  ExampleConnectorGeneratedQueryImpl<
      ListMyContributionsQuery.Data,
      Unit
  >(
    connector,
    ListMyContributionsQuery.Companion.operationName,
    ListMyContributionsQuery.Companion.dataDeserializer,
    ListMyContributionsQuery.Companion.variablesSerializer,
  )


private class ListUsersQueryImpl(
  connector: ExampleConnector
):
  ListUsersQuery,
  ExampleConnectorGeneratedQueryImpl<
      ListUsersQuery.Data,
      Unit
  >(
    connector,
    ListUsersQuery.Companion.operationName,
    ListUsersQuery.Companion.dataDeserializer,
    ListUsersQuery.Companion.variablesSerializer,
  )


private class UpdateContributionMutationImpl(
  connector: ExampleConnector
):
  UpdateContributionMutation,
  ExampleConnectorGeneratedMutationImpl<
      UpdateContributionMutation.Data,
      UpdateContributionMutation.Variables
  >(
    connector,
    UpdateContributionMutation.Companion.operationName,
    UpdateContributionMutation.Companion.dataDeserializer,
    UpdateContributionMutation.Companion.variablesSerializer,
  )


private class UpdateEraMutationImpl(
  connector: ExampleConnector
):
  UpdateEraMutation,
  ExampleConnectorGeneratedMutationImpl<
      UpdateEraMutation.Data,
      UpdateEraMutation.Variables
  >(
    connector,
    UpdateEraMutation.Companion.operationName,
    UpdateEraMutation.Companion.dataDeserializer,
    UpdateEraMutation.Companion.variablesSerializer,
  )


private class UpdateGarmentMutationImpl(
  connector: ExampleConnector
):
  UpdateGarmentMutation,
  ExampleConnectorGeneratedMutationImpl<
      UpdateGarmentMutation.Data,
      UpdateGarmentMutation.Variables
  >(
    connector,
    UpdateGarmentMutation.Companion.operationName,
    UpdateGarmentMutation.Companion.dataDeserializer,
    UpdateGarmentMutation.Companion.variablesSerializer,
  )


private class UpdateUserMutationImpl(
  connector: ExampleConnector
):
  UpdateUserMutation,
  ExampleConnectorGeneratedMutationImpl<
      UpdateUserMutation.Data,
      UpdateUserMutation.Variables
  >(
    connector,
    UpdateUserMutation.Companion.operationName,
    UpdateUserMutation.Companion.dataDeserializer,
    UpdateUserMutation.Companion.variablesSerializer,
  )


