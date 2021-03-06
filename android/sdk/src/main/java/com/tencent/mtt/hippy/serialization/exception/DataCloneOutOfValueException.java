/* Tencent is pleased to support the open source community by making Hippy available.
 * Copyright (C) 2021 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencent.mtt.hippy.serialization.exception;

@SuppressWarnings("unused")
public class DataCloneOutOfValueException extends IndexOutOfBoundsException {

  private static final long UINT32_MAX_VALUE = 4294967296L;  // uint32(2^32)

  public DataCloneOutOfValueException(int excepted) {
    super("Excepted:" + (UINT32_MAX_VALUE + excepted) + "(" + excepted + ")");
  }
}
