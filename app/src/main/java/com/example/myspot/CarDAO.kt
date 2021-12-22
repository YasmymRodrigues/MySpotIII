package com.example.myspot

import androidx.room.*
import com.example.myspot.ui.Car

@Dao
  interface CarDAO {
         @Insert
         suspend fun insert(cars: Car):Long

         //Extra
         @Update
         suspend fun update(cars: Car)
         //Extra
         @Query("DELETE FROM car WHERE id=:id")
         suspend fun delete(id: Int) : Int

        /* @Query("DELETE FROM car")
         suspend fun deleteAll(): List<Car>*/

         @Query("SELECT * FROM car")
         suspend fun getAll(): List<Car>

         @Query("SELECT * FROM car WHERE uuid = :uuid")
         suspend fun getById(uuid: String): Car

        /* @Query("SELECT * FROM user WHERE modelo " +
                 "last_name LIKE :last LIMIT 1")
         fun findByModelo(modelo: String): Car

         @Insert
         fun insertAll(vararg cars: Car)

         @Delete
         fun delete(car: Car)*/
     }
