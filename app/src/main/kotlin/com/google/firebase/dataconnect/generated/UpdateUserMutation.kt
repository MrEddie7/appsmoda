
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



public interface UpdateUserMutation :
    com.google.firebase.dataconnect.generated.GeneratedMutation<
      ExampleConnector,
      UpdateUserMutation.Data,
      UpdateUserMutation.Variables
    >
{
  
    @kotlinx.serialization.Serializable
  public data class Variables(
  
    val bio: String,
  
  ) {
    
    
  }
  

  
    @kotlinx.serialization.Serializable
  public data class Data(
  
    val user_update: UserKey?,
  
  ) {
    
    
  }
  

  public companion object {
    public val operationName: String = "UpdateUser"

    public val dataDeserializer: kotlinx.serialization.DeserializationStrategy<Data> =
      kotlinx.serialization.serializer()

    public val variablesSerializer: kotlinx.serialization.SerializationStrategy<Variables> =
      kotlinx.serialization.serializer()
  }
}

public fun UpdateUserMutation.ref(
  
    bio: String,

  
  
): com.google.firebase.dataconnect.MutationRef<
    UpdateUserMutation.Data,
    UpdateUserMutation.Variables
  > =
  ref(
    
      UpdateUserMutation.Variables(
        bio=bio,
  
      )
    
  )

public suspend fun UpdateUserMutation.execute(

  
    
      bio: String,

  

  ): com.google.firebase.dataconnect.MutationResult<
    UpdateUserMutation.Data,
    UpdateUserMutation.Variables
  > =
  ref(
    
      bio=bio,
  
    
  ).execute()


