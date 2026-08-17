
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



public interface UpdateContributionMutation :
    com.google.firebase.dataconnect.generated.GeneratedMutation<
      ExampleConnector,
      UpdateContributionMutation.Data,
      UpdateContributionMutation.Variables
    >
{
  
    @kotlinx.serialization.Serializable
  public data class Variables(
  
    val id: @kotlinx.serialization.Serializable(with = com.google.firebase.dataconnect.serializers.UUIDSerializer::class) java.util.UUID,
  
    val content: String,
  
  ) {
    
    
  }
  

  
    @kotlinx.serialization.Serializable
  public data class Data(
  
    val contribution_update: ContributionKey?,
  
  ) {
    
    
  }
  

  public companion object {
    public val operationName: String = "UpdateContribution"

    public val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data> =
      kotlinx.serialization.serializer()

    public val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables> =
      kotlinx.serialization.serializer()
  }
}

public fun UpdateContributionMutation.ref(
  
    id: java.util.UUID,content: String,

  
  
): com.google.firebase.dataconnect.MutationRef<
    UpdateContributionMutation.Data,
    UpdateContributionMutation.Variables
  > =
  ref(
    
      UpdateContributionMutation.Variables(
        id=id,content=content,
  
      )
    
  )

public suspend fun UpdateContributionMutation.execute(

  
    
      id: java.util.UUID,content: String,

  

  ): com.google.firebase.dataconnect.MutationResult<
    UpdateContributionMutation.Data,
    UpdateContributionMutation.Variables
  > =
  ref(
    
      id=id,content=content,
  
    
  ).execute()


