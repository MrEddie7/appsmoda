
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



public interface CreateContributionMutation :
    com.google.firebase.dataconnect.generated.GeneratedMutation<
      ExampleConnector,
      CreateContributionMutation.Data,
      CreateContributionMutation.Variables
    >
{
  
    @kotlinx.serialization.Serializable
  public data class Variables(
  
    val garmentId: @kotlinx.serialization.Serializable(with = com.google.firebase.dataconnect.serializers.UUIDSerializer::class) java.util.UUID,
  
    val content: String,
  
  ) {
    
    
  }
  

  
    @kotlinx.serialization.Serializable
  public data class Data(
  
    val contribution_insert: ContributionKey,
  
  ) {
    
    
  }
  

  public companion object {
    public val operationName: String = "CreateContribution"

    public val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data> =
      kotlinx.serialization.serializer()

    public val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables> =
      kotlinx.serialization.serializer()
  }
}

public fun CreateContributionMutation.ref(
  
    garmentId: java.util.UUID,content: String,

  
  
): com.google.firebase.dataconnect.MutationRef<
    CreateContributionMutation.Data,
    CreateContributionMutation.Variables
  > =
  ref(
    
      CreateContributionMutation.Variables(
        garmentId=garmentId,content=content,
  
      )
    
  )

public suspend fun CreateContributionMutation.execute(

  
    
      garmentId: java.util.UUID,content: String,

  

  ): com.google.firebase.dataconnect.MutationResult<
    CreateContributionMutation.Data,
    CreateContributionMutation.Variables
  > =
  ref(
    
      garmentId=garmentId,content=content,
  
    
  ).execute()


