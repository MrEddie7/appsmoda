
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



public interface UpdateGarmentMutation :
    com.google.firebase.dataconnect.generated.GeneratedMutation<
      ExampleConnector,
      UpdateGarmentMutation.Data,
      UpdateGarmentMutation.Variables
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
  
    val garment_update: GarmentKey?,
  
  ) {
    
    
  }
  

  public companion object {
    public val operationName: String = "UpdateGarment"

    public val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data> =
      kotlinx.serialization.serializer()

    public val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables> =
      kotlinx.serialization.serializer()
  }
}

public fun UpdateGarmentMutation.ref(
  
    id: java.util.UUID,description: String,

  
  
): com.google.firebase.dataconnect.MutationRef<
    UpdateGarmentMutation.Data,
    UpdateGarmentMutation.Variables
  > =
  ref(
    
      UpdateGarmentMutation.Variables(
        id=id,description=description,
  
      )
    
  )

public suspend fun UpdateGarmentMutation.execute(

  
    
      id: java.util.UUID,description: String,

  

  ): com.google.firebase.dataconnect.MutationResult<
    UpdateGarmentMutation.Data,
    UpdateGarmentMutation.Variables
  > =
  ref(
    
      id=id,description=description,
  
    
  ).execute()


