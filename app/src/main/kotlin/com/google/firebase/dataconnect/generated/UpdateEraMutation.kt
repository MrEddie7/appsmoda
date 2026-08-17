
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



public interface UpdateEraMutation :
    com.google.firebase.dataconnect.generated.GeneratedMutation<
      ExampleConnector,
      UpdateEraMutation.Data,
      UpdateEraMutation.Variables
    >
{
  
    @kotlinx.serialization.Serializable
  public data class Variables(
  
    val id: @kotlinx.serialization.Serializable(with = com.google.firebase.dataconnect.serializers.UUIDSerializer::class) java.util.UUID,
  
    val description: String,
  
  ) {
    
    
  }
  

  
    @kotlinx.serialization.Serializable
  public data class Data(
  
    val era_update: EraKey?,
  
  ) {
    
    
  }
  

  public companion object {
    public val operationName: String = "UpdateEra"

    public val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data> =
      kotlinx.serialization.serializer()

    public val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables> =
      kotlinx.serialization.serializer()
  }
}

public fun UpdateEraMutation.ref(
  
    id: java.util.UUID,description: String,

  
  
): com.google.firebase.dataconnect.MutationRef<
    UpdateEraMutation.Data,
    UpdateEraMutation.Variables
  > =
  ref(
    
      UpdateEraMutation.Variables(
        id=id,description=description,
  
      )
    
  )

public suspend fun UpdateEraMutation.execute(

  
    
      id: java.util.UUID,description: String,

  

  ): com.google.firebase.dataconnect.MutationResult<
    UpdateEraMutation.Data,
    UpdateEraMutation.Variables
  > =
  ref(
    
      id=id,description=description,
  
    
  ).execute()


